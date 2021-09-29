package com.torryharris.model;

public class Suv extends Car{
    private String drivemode;
    private boolean sunroof;

    public Suv(String name, String fuel, int engine, double power, int noofgears, Tyre tyre, MusicSystem musicsystem, String drivemode,boolean sunroof) {
        super(name, fuel, engine, power, noofgears, tyre, musicsystem);
        this.drivemode = drivemode;
        this.sunroof=sunroof;
    }

    public String getDrivemode() {
        return drivemode;
    }

    public void setDrivemode(String drivemode) {
        this.drivemode = drivemode;
    }

    public boolean isSunroof() {
        return sunroof;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }
    public void displaySuvFeature(){
        System.out.println("SUV car features:");
        feature();
        System.out.println("Drive mode:"+drivemode);
        System.out.println("Sun roof:"+sunroof);
    }
}
