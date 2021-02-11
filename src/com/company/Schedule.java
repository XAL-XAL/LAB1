package com.company;

public class Schedule {

    public int startTime;
    public int endTime;

    //constructor
    Schedule(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public static void main(String[] args) {

        System.out.printf("hi");

    }

//setters
    public void setStart_time(int startTime){this.startTime = startTime;}
    public void setEnd_time(int endTime){this.endTime = endTime;}
//getters
    public int getStart_time(){return this.startTime;}
    public int getEnd_time(){return this.endTime;}
}