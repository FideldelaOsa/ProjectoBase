package com.iesemilidarder.projectoBase.data.data;

public abstract class Vehicle {
    private Integer numWheels;
    private Double price;
    private String color;
    private Integer numDoors;

    public Integer getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(Integer numDoors) {
        this.numDoors = numDoors;
    }

    public Integer getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(Integer numWheels) {
        this.numWheels = numWheels;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void start();

    public void brake() { doLog("he frenado"); }

    public void doLog(String message){
        System.out.println(message);
        }
    private String showLog(String message) {
        doLog(message);
        return message;
    }

}


