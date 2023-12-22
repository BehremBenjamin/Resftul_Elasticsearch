package com.practical.restful.training.Service;

import Entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/car/v1")
public class CarApi {

    @Autowired
    public CarService carService;

    @GetMapping("/random")
    public Car random() {
        return carService.generateCar();
    }

}
