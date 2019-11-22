package com.shashank.corejava;

public class PassByValue {
    
    public static void main(String...strings) {
        
        Duck d = new Duck("Donald");
        renameCustomer(d);
        System.out.println(d.getName());
    }

    private static void renameCustomer(Duck ducky) {
        ducky.setName("Daffy");
    }

}


class Duck {
    
    private String name;
    
    public Duck(String name) {
        this.name = name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}