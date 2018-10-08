package com.iesemilidarder.projectoBase.data.data;

public abstract class Vehicle {
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


