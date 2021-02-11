package com.company;

public class Schedule {

    public int start_time;
    public int end_time;

    public static void main(String[] args) {

    }

    Schedule(int start_time, int end_time) {
        this.start_time = start_time;
        this.end_time = end_time;
    }

    public void setStart_time(int start_time) {
        this.start_time = start_time;
    }

    public int getStart_time(){
        return this.start_time;
    }

    public void setEnd_time(int end_time){
        this.end_time = end_time;//asdsdsadasd
    }

    public int getEnd_time(){
        return this.end_time;
    }
}