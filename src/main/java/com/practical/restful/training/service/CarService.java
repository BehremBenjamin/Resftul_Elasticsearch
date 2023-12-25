package com.practical.restful.training.service;

import com.practical.restful.training.entity.Car;

import java.util.List;

public interface CarService {
    List<String> BRANDS = List.of("Toyota", "Honda", "Ford", "Ferrari", "BMW");
    List<String> COLORS = List.of("Red", "Black", "White", "Orange", "Silver");
    List<String> TYPES = List.of("Sedan", "SUV", "MPV", "LKW", "KOMBI");
    List<String> ADDITIONAL_FEATURES = List.of("GPS", "Alarm", "Sunroof", "Media Player", "Leather Seats");
    List<String> FUELS = List.of("Petrol", "Electric", "Hybrid", "Diesel", "Other");
    List<String> TIRE_MANUFACTURERS = List.of("Goodyear", "Bridgestone", "Dunlop", "Sava", "Pirelli");

    Car generateCar();
}
