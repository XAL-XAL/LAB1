package com.company;

public class Highway extends Route{
    public int laneCount;
    Highway(int startPoint, int endPoint, int LaneCount){
        super(startPoint,endPoint);
        this.laneCount=laneCount;
    }
    public void setLaneCount(int laneCount){this.laneCount=laneCount;}
    public int getLaneCount(){return this.laneCount;}
}
