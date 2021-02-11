package com.company;

public class CharteredBus extends Bus{

    int capacity;
    String renter;

    CharteredBus(String make, String model, int year, String VIN, String plateNo, int capacity, String renter){
        super(make, model, year, VIN, plateNo);
        this.capacity = capacity;
        this.renter = renter;
    }


}
