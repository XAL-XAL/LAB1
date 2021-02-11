package com.company;

public class Trip extends Schedule{

    String from;
    String destination;

    //Constructor
    Trip(int startTime, int endTime, String from, String destination){
        super(startTime, endTime);
        this.from = from;
        this.destination = destination;
    }



}
