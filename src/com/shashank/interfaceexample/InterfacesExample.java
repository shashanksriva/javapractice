package com.shashank.interfaceexample;

interface Display{
    
    void show();
    
    default void touchScreen() {
        System.out.println("Screen was touched!!");
    }
    
    static void information() {
        System.out.println("touch screen info");
    }
}

interface Display2{
    
    void show();
    
    default void touchScreen() {
        System.out.println("Screen 2 was touched!!");
    }
    
    default String getPosition() {
        return "top left";
    }
    
    static void information() {
        System.out.println("touch screen 2 info");
    }
    
    static void newinformation() {
        
    }
}


public class InterfacesExample implements Display, Display2 {

    @Override
    public void show() {
        
    }

    @Override
    public void touchScreen() {
        System.out.println("Do something!!!");
    }
    
    
    public static void main(String...strings) {
        Display.information();
    }
}
