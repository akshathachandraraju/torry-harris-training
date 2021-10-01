package com.torryharris.model;

public class Insurance {
    private String insname;
   private int insid;
   private int inssum;
    private String instype;

    public Insurance() {
    }

    public Insurance(String insname, int insid, int inssum, String instype) {
        this.insname = insname;
        this.insid = insid;
        this.inssum = inssum;
        this.instype = instype;
    }

    public String getInsname() {
        return insname;
    }

    public void setInsname(String insname) {
        this.insname = insname;
    }

    public int getInsid() {
        return insid;
    }

    public void setInsid(int insid) {
        this.insid = insid;
    }

    public int getInssum() {
        return inssum;
    }

    public void setInssum(int inssum) {
        this.inssum = inssum;
    }

    public String getInstype() {
        return instype;
    }

    public void setInstype(String instype) {
        this.instype = instype;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "insname='" + insname + '\'' +
                ", insid=" + insid +
                ", inssum=" + inssum +
                ", instype='" + instype + '\'' +
                '}';
    }
}
