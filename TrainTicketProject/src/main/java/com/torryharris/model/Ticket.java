package com.torryharris.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.TreeMap;

public class Ticket {
    public static int counter=100;
    private String pnr;
    private String travel_date;
    private Train train;
    private TreeMap<Passenger,Integer>passengerTreeMap=new TreeMap<>();

    public Ticket() {
    }

    public Ticket(String pnr, String travel_date, Train train, TreeMap<Passenger, Integer> passengerTreeMap) {
        this.pnr = pnr;
        this.travel_date = travel_date;
        this.train = train;
        this.passengerTreeMap = passengerTreeMap;
    }

    public TreeMap<Passenger, Integer> getPassengerTreeMap() {
        return passengerTreeMap;
    }

    public void setPassengerTreeMap(TreeMap<Passenger, Integer> passengerTreeMap) {
        this.passengerTreeMap = passengerTreeMap;
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

    public String getTravel_date() {
        return travel_date;
    }

    public void setTravel_date(String travel_date) {
        this.travel_date = travel_date;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    //methods
    public String generatePNR(){
        this. pnr= this.getTrain().getDestination().charAt(0)+this.getTrain().getSource().charAt(0)+"_"+this.getTravel_date()+"_"+counter;
        counter++;
        System.out.println(this.pnr);
        return (String.valueOf(this.pnr));
    }
    private double calcPassengerFair(Passenger passenger) {
        double fare = train.getTicket_price();
        if (passenger.getAge() <= 12) {
            fare=fare/2;
        } else if (passenger.getAge() >= 60) {
            fare=fare*(60/100);
        } else if (passenger.getGender() == 'F') {
            fare=fare*(25/100);
        }
        return fare;
    }
    public void addPassenger(String name,char gender,int age){
        Passenger passenger=new Passenger(name,gender,age);
        double fare=calcPassengerFair(passenger);
        passengerTreeMap.put(passenger,(int)fare);
    }
    public double calculateTotalTicketPrice(){
        int sum=0;
        for(Passenger passenger:passengerTreeMap.keySet()){
            sum=sum+passengerTreeMap.get(passenger);
        }
        return sum;
    }
    private StringBuilder generateTicket(){
        Passenger passenger=new Passenger();
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("PNR:"+generatePNR());
        stringBuilder.append("Train No:"+getTrain().getTrain_no());
        stringBuilder.append("Train Name:"+getTrain().getTrain_name());
        stringBuilder.append("From:"+getTrain().getSource());
        stringBuilder.append("To:"+getTrain().getDestination());
        stringBuilder.append("Travel Date:"+getTravel_date());
        stringBuilder.append("\n");
        stringBuilder.append("Passengers:");
        stringBuilder.append("Name"+passenger.getName()+"\t"+"Age"+passenger.getAge()+"\t"+"Gender"+passenger.getGender()+"\t"+"Fare"+this.calcPassengerFair(passenger)+"\n");
        stringBuilder.append("Total Price:"+calculateTotalTicketPrice());
        return stringBuilder;
    }
    public void writeTicket() throws IOException {
        FileInputStream fis = new FileInputStream(generatePNR()+" "+".txt");
        System.out.println("Ticket Details:");
        int ch;
        while ((ch = fis.read()) != -1)
            System.out.print((char) ch);
        fis.close();

        FileOutputStream fos=new FileOutputStream(generatePNR()+" "+".txt");
        StringBuilder str=this.generateTicket();
        fos.write( str);
        fos.close();
        System.out.println("\nTicket Generated ");
    }

}
