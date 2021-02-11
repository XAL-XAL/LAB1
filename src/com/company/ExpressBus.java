package com.company;

public class ExpressBus extends Bus{
    String city;

    ExpressBus(String make, String model, int year,String VIN, String plateNo, String city){
        super(make, model, year, VIN, plateNo);
        this.city = city;
    }
}
