package com.github.jcarlosj;

import com.github.jcarlosj.smarts.SmartDevice;
import com.github.jcarlosj.smarts.SmartPhone;
import com.github.jcarlosj.smarts.SmartWatch;

public class Ejercicio4 {

    public static void main(String[] args) {

        SmartDevice sw_xiaomi = new SmartWatch( "Xiaomi", "Redmi", "Android", 60.0f, 1.55f, true );
        SmartDevice sp_apple = new SmartPhone( "Apple", "14 Pro", "iOS", 1790.0f, 6.7f, true );
        System.out.println( sw_xiaomi );
        System.out.println( sp_apple );
    }

}
