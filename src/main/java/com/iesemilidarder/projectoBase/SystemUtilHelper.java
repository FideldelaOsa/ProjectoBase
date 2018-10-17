package com.iesemilidarder.projectoBase;

/**
 * com.iesemilidarder.projectoBase
 * Class SystemUtilHelper
 * By berto. 08/10/2018
 */
public class SystemUtilHelper {

    private SystemUtilHelper() {
        //Todo: OS generalization
    }

    public static void consolePrint(String message) {
        System.out.println(message);
    }


    public static void logError(Exception e) {
        consolePrint("ERROR:" + e);
    }


}
