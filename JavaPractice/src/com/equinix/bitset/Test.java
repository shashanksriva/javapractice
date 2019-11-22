package com.equinix.bitset;

public class Test {

    public static void main(String...strings) {
        String deviceName = "NavuListEntru[kfdkaf],/ncs/{junos0}";
        deviceName = deviceName.substring(deviceName.indexOf("{") + 1, deviceName.indexOf("}"));
        System.out.println(deviceName);
    }
}
