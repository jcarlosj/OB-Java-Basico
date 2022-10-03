package com.github.jcarlosj.smarts;

public abstract class SmartDevice {
    protected String brand = "";
    protected String model = "";
    protected String OS = "";
    protected float price;
    protected float screen_inches;
    protected boolean have_NFC;
    protected boolean have_bluetooth = true;
    protected boolean have_accelerometer = true;
    protected boolean have_gyroscope = true;
    protected boolean have_optical_heart_rate_sensor;
    protected boolean is_water_resistant;

    public SmartDevice() {}

    public SmartDevice(
            String brand,
            String model,
            String OS,
            float price,
            float screen_inches,
            boolean have_bluetooth,
            boolean have_accelerometer,
            boolean have_gyroscope,
            boolean have_optical_heart_rate_sensor
    ) {
        this.brand = brand;
        this.model = model;
        this.OS = OS;
        this.price = price;
        this.screen_inches = screen_inches;
        this.have_bluetooth = have_bluetooth;
        this.have_accelerometer = have_accelerometer;
        this.have_gyroscope = have_gyroscope;
        this.have_optical_heart_rate_sensor = have_optical_heart_rate_sensor;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "\n\tbrand='" + brand + '\'' +
                ", \n\tmodel='" + model + '\'' +
                ", \n\tOS='" + OS + '\'' +
                ", \n\tprice=" + price +
                ", \n\tscreen_inches=" + screen_inches +
                ", \n\thave_bluetooth=" + have_bluetooth +
                ", \n\thave_accelerometer=" + have_accelerometer +
                ", \n\thave_gyroscope=" + have_gyroscope +
                ", \n\thave_optical_heart_rate_sensor=" + have_optical_heart_rate_sensor +
                ", \n\tis_water_resistant=" + is_water_resistant +
                "\n}";
    }
}
