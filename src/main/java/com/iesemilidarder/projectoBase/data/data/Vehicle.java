package com.iesemilidarder.projectoBase.data.data;

public abstract class Vehicle {
    public abstract void start();

    public void brake() { log("he frenado"); }

    public void log(String message){
        System.out.println(message);
        }
    }
}
