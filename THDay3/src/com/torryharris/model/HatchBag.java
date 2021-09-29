package com.torryharris.model;

public class HatchBag extends Car{
    String steeringType;

    public HatchBag(String name, String fuel, int engine, double power, int noofgears, Tyre tyre,MusicSystem musicSystem, String steeringType) {
        super(name, fuel, engine, power, noofgears, tyre,musicSystem);
        this.steeringType = steeringType;
    }
    public void displayHatchFeature(){
        System.out.println("HatchBag car features:");
        feature();
        System.out.println("steering type:"+steeringType);
        System.out.println();
    }

    public String getSteeringType() {
        return steeringType;
    }

    public void setSteeringType(String steeringType) {
        this.steeringType = steeringType;
    }

}
