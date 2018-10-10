package com.iesemilidarder.projectoBase.data;

import com.iesemilidarder.projectoBase.data.data.Coche;
import com.iesemilidarder.projectoBase.data.data.Moto;
import com.iesemilidarder.projectoBase.data.data.Vehicle;

public class Launcher {
    public static void main(String... args) {
        System.out.println("Concesionario fidelin App 2.0");
        Moto moto = new Moto();
        moto.setNumWheels(2);
        moto.setPrice(123.45);
        moto.setColor("Rojo");
        System.out.println(moto.getNumWheels());
        moto.start();
        System.out.println("pista que voy!, nano");
        moto.brake();
        Vehicle Coche = new Coche();
        Coche.setNumDoors(3);
        Coche.setNumWheels(4);

    }
}
