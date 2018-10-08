package com.iesemilidarder.projectoBase.data.data;

public class Submarino extends Embarcacion implements IDive {
    public void goDeeper() {

    }

    public void goSurface() {

    }

    public void doFloat() {
        super.doFloat();
        System.out.println("Floto y navego nena");
    }
}
