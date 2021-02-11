package com.company;

public class TourBus extends Bus{

    String placesToSee;

    TourBus(String make, String model, int year, String VIN, String plateNo, String placesToSee){
        super(make, model, year, VIN, plateNo);
        this.placesToSee = placesToSee;
    }

}
