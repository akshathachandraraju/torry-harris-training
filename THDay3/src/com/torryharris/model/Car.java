package com.torryharris.model;

public class Car {
    private String name;
    private String fuel;
    private int engine;
    private double power;
    private int noofgears;
    /* composition*/
    private Tyre tyre;
    private MusicSystem musicsystem;

    public Car() {
    }

    public Car(String name, String fuel, int engine, double power, int noofgears, Tyre tyre,MusicSystem musicsystem) {
        this.name = name;
        this.fuel=fuel;
        this.engine=engine;
        this.power=power;
        this.noofgears = noofgears;
        this.tyre=tyre;
       this.musicsystem=musicsystem;
    }



    public MusicSystem getMusicsystem() {return musicsystem;}
    public void setMusicsystem(MusicSystem musicsystem) {
        this.musicsystem = musicsystem;
    }
    public Tyre getTyre() { return tyre;}
    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }
    public String getName() {return name;}
    public void setName(String name) {
        this.name = name;
    }
    public String getFuel() {return fuel;}
    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
    public int getEngine() {return engine;}
    public void setEngine(int engine) {
        this.engine = engine;
    }
    public double getPower() {return power;}
    public void setPower(double power) {
        this.power = power;
    }
    public int getNoofgears() {return noofgears;}
    public void setNoofgears(int noofgears) {
        this.noofgears = noofgears;
    }
    public void accelarate(){
        System.out.println(name+"car is accelarating...");
    }
    public void applyBreak(){
        System.out.println(name+"car is applying break...");
    }
    public void steer() {
        System.out.println(name + "car is changing direction..");
    }
    public void changeGear(int gear){
        if(gear==0 || gear>noofgears)
            System.out.println("invalid");
        else
            System.out.println(name+" car changing to "+gear);
    }
    public void feature(){
        System.out.println("car name :"+name);
        System.out.println("fuel type :"+fuel);
        System.out.println("Engine capacity :"+engine+"CC");
        System.out.println("Power:"+power+"BHP");
        System.out.println("no of gears:"+noofgears);
        System.out.println("Tyre->name:"+tyre.getName()+"\nTyre->size:"+tyre.getSize());
        System.out.println("Music System->name:"+musicsystem.getName()+"\nsoundwoofer:"+musicsystem.isSoundwoofer()+"\nLCD size:"+musicsystem.getLCDsize()+"\nNo of speakers:"+musicsystem.getNoofspeakers());
    }
    }


