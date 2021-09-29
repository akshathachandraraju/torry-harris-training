package com.torryharris.model;

public class Lead extends Emplyoee{
    private int teamsize;

    public Lead() {
    }

    public Lead(String name, int emplyoeeid, String designation, float salary, int teamsize) {
        super(name, emplyoeeid, designation, salary);
        this.teamsize = teamsize;
    }

    public int getTeamsize() {
        return teamsize;
    }

    public void setTeamsize(int teamsize) {
        this.teamsize = teamsize;
    }
    public void standupCall(){
        System.out.println("calls standup call");
    }

    @Override
    public String toString() {
        return "Lead{" +  super.toString()+
                " , "+
                "teamsize=" + teamsize +
                '}';
    }
}
