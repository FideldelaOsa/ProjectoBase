package com.iesemilidarder.projectoBase.data;

import com.iesemilidarder.projectoBase.AppConstants;
import com.iesemilidarder.projectoBase.exception.IESMyException;
import com.sun.istack.internal.localization.NullLocalizable;

/**
 * com.iesemilidarder.projectoBase.data
 * Class Vehicle
 * By berto. 04/10/2018
 */
public abstract class Vehicle {
    private String name;
    private String color;
    private Integer numWheels;
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(Integer numWheels) {
        if (numWheels == null || numWheels > AppConstants.MAX_WHEELS) {
            throw new IESMyException("Demasiadas ruedas nen!");
        }
        this.numWheels = numWheels;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public abstract void start();

    public void brake() {
        doLog("he frenado");
    }

    /**
     * Prints the message where it should
     *
     * @param message txt
     */
    protected void doLog(String message) {
        System.out.println(message);
    }

    private String showLog(String message) {
        doLog(message);
        return message;
    }
}
