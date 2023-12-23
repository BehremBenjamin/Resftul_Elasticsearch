package com.practical.restful.training.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.time.LocalDate;
import java.util.List;
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Car {
    private String brand, color, type;
    private int price;
    private boolean available;

    @JsonFormat(pattern = "dd.MM.yyyy", timezone = "UTC+1")
    private LocalDate firstReleaseDate;

    public String getSecretFeature() {
        return secretFeature;
    }

    public void setSecretFeature(String secretFeature) {
        this.secretFeature = secretFeature;
    }
    @JsonInclude(value = JsonInclude.Include.NON_EMPTY)
    private String secretFeature;

    private List<String> additionalFeatures;

    private Engine engine;
    private List<Tire> tires;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public List<Tire> getTires() {
        return tires;
    }

    public void setTires(List<Tire> tires) {
        this.tires = tires;
    }

    public List<String> getAdditionalFeatures() {
        return additionalFeatures;
    }

    public void setAdditionalFeatures(List<String> additionalFeatures) {
        this.additionalFeatures = additionalFeatures;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public LocalDate getFirstReleaseDate() {
        return firstReleaseDate;
    }

    public void setFirstReleaseDate(LocalDate firstReleaseDate) {
        this.firstReleaseDate = firstReleaseDate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", available=" + available +
                ", firstReleaseDate=" + firstReleaseDate +
                ", secretFeature='" + secretFeature + '\'' +
                ", additionalFeatures=" + additionalFeatures +
                ", engine=" + engine +
                ", tires=" + tires +
                '}';
    }

    public Car(String brand, String color, String type) {
        this.brand = brand;
        this.color = color;
        this.type = type;
    }


}
