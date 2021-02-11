package com.company;

public class CharteredBus extends Bus{

    int capacity;
    String renter;

    CharteredBus(String make, String model, int year, String VIN, String plateNo, int capacity, String renter){
        super(make, model, year, VIN, plateNo);
        this.capacity = capacity;
        this.renter = renter;
    }
   public void printCharteredBus(){
       System.out.println("Make: " + this.make + "\nModel: " + this.model + "\nYear: " + this.year + "\nVIN: " + this.VIN + "\nPlate Number: " + this.plateNo + "\nCapacity: " + this.capacity + "\nRenter: " + this.renter);
    }
}
