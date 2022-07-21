package com.example.sfgdependencyinversion.without;

/**
 * @Author mehmetali.cetin
 * @Date 2022-07-21
 */
//low level class
public class LightBulb {
    public void turnOn() {
        System.out.println("LightBulb: Bulb turned on...");
    }
    public void turnOff() {
        System.out.println("LightBulb: Bulb turned off...");
    }
}
