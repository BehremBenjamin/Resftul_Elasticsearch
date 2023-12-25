package com.practical.restful.training.common;

import com.practical.restful.training.entity.Car;
import com.practical.restful.training.repository.CarElasticRepository;
import com.practical.restful.training.service.CarService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarElasticDataSource {

    private static final Logger LOG = LoggerFactory.getLogger(CarElasticDataSource.class);

    @Autowired
    private CarElasticRepository carRepo;

    @Autowired
    @Qualifier("randomCarService")
    private CarService carService;

    @Autowired
    @Qualifier("webClientElasticsearch")
    private WebClient webClient;

    List<Car> carList = new ArrayList<>();

    @EventListener(ApplicationReadyEvent.class)
    public void populateData() {
        var response = webClient.delete().uri("/mycars").retrieve().bodyToMono(String.class).block();
        LOG.info("end delete with response {}", response);

        for (int i = 0; i < 10000; i++) {
            carList.add(carService.generateCar());

        }

        LOG.info("added 10000 cars");
        carRepo.saveAll(carList);
    }
}



