package com.shashank.corejava;

public class ContainsTest {
    
    public static void main(String...strings) {
        
        String deviceModel = "cisco Nexus7000 C7010 (10 Slot) Chassis (\"Supervisor Module-2\")";
        String keyWord = "cisco Nexus7000 C7010";
        
        if (deviceModel.contains(keyWord)) {
            System.out.println("True......");
        }
    }

}
