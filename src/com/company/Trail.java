package com.company;

public class Trail extends Route {
    String terrain;
    double incline;

    Trail(int startPoint, int endPoint, String terrain, double incline){
        super(startPoint, endPoint);
        this.terrain = terrain;
        this.incline = incline;

    }

}
