package com.company;

public class Schedule {

    public int startTime;
    public int endTime;

    //constructor
    Schedule(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
    //private CharteredBus bus;
    public static void main(String[] args) {

     CharteredBus bus = new CharteredBus("Ford", "GT6", 1996, "123757849", "12A524GT", 200, "BOB");
     System.out.println(bus.getMake());
     bus.printCharteredBus();


    }

//setters
    public void setStart_time(int startTime){this.startTime = startTime;}
    public void setEnd_time(int endTime){this.endTime = endTime;}
//getters
    public int getStart_time(){return this.startTime;}
    public int getEnd_time(){return this.endTime;}
}