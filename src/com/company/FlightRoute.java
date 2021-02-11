package com.company;

public class FlightRoute extends Route{
    double distance;
    double altitude;

    FlightRoute(int startPoint, int endPoint, double distance, double altitude){
        super(startPoint, endPoint);
        this.distance = distance;
        this.altitude = altitude;
    }
    public void setAltitude(double altitude){this.altitude=altitude;}
    public double getAltitude(){return this.altitude;}

    public void setDistance(double distance){this.distance = distance;}
    public double getDistance(){return this.distance;}
}
