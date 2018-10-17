package com.iesemilidarder.projectoBase.data;

/**
 * com.iesemilidarder.projectoBase.data
 * Class Submarine
 * By berto. 08/10/2018
 */
public class Submarine extends WaterCraft implements IDive{

    public void goDeeper() {

    }

    public void goSurface() {

    }

    public void doFloat() {
        super.doFloat();
        System.out.println("Floto, pero tambien me piro!");
    }
}
