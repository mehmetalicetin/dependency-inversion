package com.example.sfgdependencyinversion.with;

/**
 * @Author mehmetali.cetin
 * @Date 2022-07-21
 */
public class Fan implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("Fan: Fan turned on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan: Fan turned off...");
    }
}
