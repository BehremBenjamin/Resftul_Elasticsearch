package com.practical.restful.training.entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Engine {
    private String fuelType;
    private int horsePower;

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine {" + "fuelType='" + fuelType + '\'' + ", horsePower=" + horsePower + '}';
    }

    public Engine(String fuelType, int horsePower) {
        this.fuelType = fuelType;
        this.horsePower = horsePower;
    }

    public Engine() {
    }
}
