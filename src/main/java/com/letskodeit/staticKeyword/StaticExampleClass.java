package com.letskodeit.staticKeyword;

/**
 * Created by @author parinitmishra on 5/9/2020
 */
public class StaticExampleClass {

    private static int wheelsCount = 4;
    private String make;
    private static int instanceNum = 0;

    public StaticExampleClass(String make) {
        this.make = make;
        instanceNum++;
    }

    public String getMake() {
        return make;
    }

    public static int getInstanceNum() {
        return instanceNum;
    }
}
