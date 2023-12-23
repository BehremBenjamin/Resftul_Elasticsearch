package com.practical.restful.training.service;

import com.practical.restful.training.entity.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("/api/car/v1")
public class CarApi {

    private static final Logger log = LoggerFactory.getLogger(CarApi.class);

    @Autowired
    public CarService carService;

    @GetMapping("/random")
    public Car random() {
        return carService.generateCar();
    }


    @PostMapping("/echo")
    public String echo(@RequestBody Car car) {
        log.info("Car is {}", car);
        return car.toString();
    }

    @GetMapping("/car-list")
    public List<Car> carList() {
        List<Car> listOfCars = new ArrayList<>();

        for (int i = 0; i < ThreadLocalRandom.current().nextInt(1, 10); i++) {
            listOfCars.add(carService.generateCar());
        }
        return  listOfCars;
    }

}
