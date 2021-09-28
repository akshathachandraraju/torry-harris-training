package com.torryharris.model;

public class Person implements Comparable<Person>{
    private int aadharNumber;
    private String name;
    private String state;
    private String occupation;

    public Person() {
    }

    @Override
    public int compareTo(Person o) {
        return this.aadharNumber-o.aadharNumber;
    }

    public Person(int aadharNumber, String name, String state, String occupation) {
        this.aadharNumber = aadharNumber;
        this.name = name;
        this.state = state;
        this.occupation = occupation;
    }

    public int getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(int aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "aadharNumber=" + aadharNumber +
                ", name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
