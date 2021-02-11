package com.company;

public class Bus extends Vehicle{
    public String VIN;
    public String plateNo;

    Bus(String make, String model, int year, String VIN, String plateNo){
        super(make, model, year);
        this.VIN = VIN;
        this.plateNo = plateNo;
    }

    public Bus(String make, String model, int year) {
        super(make, model, year);
    }

    public void setVIN(String VIN){this.VIN=VIN;}
    public String getVIN(){return this.VIN;}

    public void setPlateNo(String plateNo){this.plateNo=plateNo;}
    public String getPlateNo(){return this.plateNo;}
}
