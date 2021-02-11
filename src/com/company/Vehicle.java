package com.company;

public class Vehicle {

    public String make;
    public String model;
    public int year;

    Vehicle(String make, String model, int year) {
        this.make=make;
        this.model=model;
        this.year=year;
    }
    //setters
    public void setMake(String make){this.make=make;}
    public void setModel(String model){this.model=model;}
    public void setYear(int year){this.year=year;}
    //getters
    public String getMake(){return make;}
    public String getModel(){return model;}
    public int getYear(){return year;}
}
