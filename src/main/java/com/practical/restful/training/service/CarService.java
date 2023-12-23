package com.practical.restful.training.service;

import com.practical.restful.training.entity.Car;

import java.util.List;

public interface CarService {
    List<String> BRANDS = List.of("Toyota", "Honda", "Ford");
    List<String> COLORS = List.of("Red", "Black", "White");
    List<String> TYPES = List.of("Sedan", "SUV", "MPV");
    List<String> ADDITIONAL_FEATURES = List.of("GPS", "Alarm", "Sunroof", "Media Player", "Leather Seats");
    List<String> FUELS = List.of("Petrol", "Electric", "Hybrid", "Diesel");
    List<String> TIRE_MANUFACTURERS = List.of("Goodyear", "Bridgestone", "Dunlop", "Sava", "Pirelli");

    Car generateCar();
}