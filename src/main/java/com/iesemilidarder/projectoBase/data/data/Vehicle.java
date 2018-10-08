package com.iesemilidarder.projectoBase.data.data;

public abstract class Vehicle {
    public abstract void start();

    public void brake() { doLog("he frenado"); }

    protected void doLog(String message){
        System.out.println(message);
        }
    public String showLog(String message) {
        
    }

}


