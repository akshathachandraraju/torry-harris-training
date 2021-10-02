package com.torryharris.model;

import java.util.Date;

public class Ticket {
    private int counter;
    private String pnr;
    private Date travel_date;
    private Train train;
    private Passenger passenger;

    public Ticket() {
    }

    public Ticket(int counter, String pnr, Date travel_date, Train train,Passenger passenger) {
        this.counter = counter;
        this.pnr = pnr;
        this.travel_date = travel_date;
        this.train = train;
        this.passenger=passenger;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public Date getTravel_date() {
        return travel_date;
    }

    public void setTravel_date(Date travel_date) {
        this.travel_date = travel_date;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }
    private void generatePNR(){
    }
    private void calcPassengerFair(Passenger passenger){

    }
    public void addPassenger(Passenger passenger){

    }
    public void calculateTotalTicketPrice(){

    }
    private void generateTicket(){

    }
    public void writeTicket(){

    }

}
