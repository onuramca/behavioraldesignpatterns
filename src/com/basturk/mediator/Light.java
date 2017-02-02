package com.basturk.mediator;

// receiver
public class Light {
    private boolean isOn = false;

    private String location = "";

    public Light() {

    }

    public Light(String location) {
        this.location = location;
    }

    public boolean isOn() {
        return this.isOn;
    }

    public void toggle() {
        if (this.isOn) {
            off();
            this.isOn = false;
        } else {
            on();
            this.isOn = true;
        }
    }

    public void on() {
        System.out.println(location + " light switched on.");
    }

    public void off() {
        System.out.println(location + " light switched off.");
    }
}
