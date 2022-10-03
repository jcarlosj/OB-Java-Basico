package com.github.jcarlosj.smarts;

public class SmartWatch extends SmartDevice {

    protected boolean is_water_resistant;

    public SmartWatch() {}

    public SmartWatch(
            String brand,
            String model,
            String OS,
            float price,
            float screen_inches,
            boolean is_water_resistant
    ) {
        super( brand, model, OS, price, screen_inches, true, true, true, true );
        this.is_water_resistant = is_water_resistant;
    }

}
