package com.practical.restful.training.Service;

import Entity.Car;

import java.util.List;

public interface CarService {
    List<String> BRANDS = List.of("Toyota", "Honda", "Ford");
    List<String> COLORS = List.of("Red", "Black", "White");

    List<String> TYPES = List.of("Sedan", "SUV", "MPV");

    Car generateCar();
}
