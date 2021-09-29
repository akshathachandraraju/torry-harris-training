package com.torryharris.model;

public class Sedan extends Car{
    private int bootspace;

    public Sedan(String name, String fuel, int engine, double power, int noofgears, Tyre tyre, MusicSystem musicsystem, int bootspace) {
        super(name, fuel, engine, power, noofgears, tyre, musicsystem);
        this.bootspace = bootspace;
    }

    public int getBootspace() {
        return bootspace;
    }

    public void setBootspace(int bootspace) {
        this.bootspace = bootspace;
    }
    public void displaySedanFeature(){
        System.out.println("Sedan car features:");
        feature();
        System.out.println("Bootspace:"+bootspace);
        System.out.println();
    }
}
