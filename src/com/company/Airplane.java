package com.company;

public class Airplane extends Vehicle{
    public String type;
    public int planeNo;

    Airplane(String make, String model, int year, String type, int planeNo){
        super(make, model, year);
        this.type=type;
        this.planeNo =planeNo;}

    public void setType(String type){this.type=type;}
    public String getType(){return this.type;}
}
