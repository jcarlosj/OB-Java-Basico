package com.github.jcarlosj.smarts;

public class SmartPhone extends SmartDevice {

    protected boolean have_NFC;

    public SmartPhone() {}

    public SmartPhone(
        String brand,
        String model,
        String OS,
        float price,
        float screen_inches,
        boolean have_NFC
    ) {
        super( brand, model, OS, price, screen_inches, true, true, true, true );
        this.have_NFC = have_NFC;
    }

}
