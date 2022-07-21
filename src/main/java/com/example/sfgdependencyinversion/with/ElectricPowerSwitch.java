package com.example.sfgdependencyinversion.with;

/**
 * @Author mehmetali.cetin
 * @Date 2022-07-21
 */
public class ElectricPowerSwitch implements Switch{
    Switchable client;
    boolean on;

    public ElectricPowerSwitch(Switchable client) {
        this.client = client;
        this.on = false;
    }

    @Override
    public boolean isOn() {
        return false;
    }

    @Override
    public void press() {
        boolean checkOn = isOn();
        if (checkOn) {
            client.turnOff();
            this.on = false;
        } else {
            client.turnOn();
            this.on = true;
        }
    }
}
