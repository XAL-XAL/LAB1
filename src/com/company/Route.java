package com.company;

public class Route extends Schedule {

    int startPoint;
    int endPoint;

    Route(int startPoint, int endPoint, int startTime, int endTime)
    {
        super(startTime, endTime);
        this.startPoint = startPoint;
        this.endPoint = endPoint;

    }
}
