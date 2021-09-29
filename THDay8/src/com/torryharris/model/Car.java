package com.torryharris.model;

import java.util.Objects;

public class Car {
    private int chassisNo;
    private String name;
    private String fuelType;
    private float power;

    public Car(int chassisNo, String name, String fuelType, float power) {
        this.chassisNo = chassisNo;
        this.name = name;
        this.fuelType = fuelType;
        this.power = power;
    }

    public int getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(int chassisNo) {
        this.chassisNo = chassisNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "chassisNo=" + chassisNo +
                ", name='" + name + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", power=" + power +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getChassisNo() == car.getChassisNo() && getName().equals(car.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getChassisNo(), getName());
    }
}
