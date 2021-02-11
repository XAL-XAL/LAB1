package com.company;

public class Vehicle {

    public string make;
    public string model;
    public int year;

    public void setMake(string make){this.make=make;}
    public void setModel(string model){this.model=model;}
    public void setYear(int year){this.year=year;}

    Vehicle(string make, string model, int year) {
        this.make=make;
        this.model=model;
        this.year=year;
    }

    public string getMake() {
        return make;
    }
    public

    public string getModel() {
        return model;
    }
    public int getYear(){
        return year;
    }
}
