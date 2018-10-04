package com.iesemilidarder.projectoBase.data;

import com.iesemilidarder.projectoBase.data.data.Moto;

public class Launcher {
    public static void main(String... args) {
        System.out.println("Concesionario fidelin App 2.0");
        Moto moto = new Moto();
        moto.start();
        System.out.println("pista que voy!, nano");
        moto.brake();
    }
}
