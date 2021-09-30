package com.torryharris.model;

import java.io.Serializable;

public class Person implements Comparable<Person>, Serializable {
  //  private static final long serialVersionUID=101;
    private int personId;
    private String name;
    private String state;
    private String occupation;

    public Person() {
    }

    @Override
    public int compareTo(Person o) {
        return this.personId-o.personId;
    }

    public Person(int personId, String name, String state, String occupation) {
        this.personId=personId;
        this.name = name;
        this.state = state;
        this.occupation = occupation;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
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
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}

