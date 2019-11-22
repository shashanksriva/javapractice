package com.shashank.corejava;

public class Blocks {

    Blocks(){
        System.out.println("NO arg constructor...");
    }
    
    static {
        System.out.println("Empty static block");
    }
    
    {
        System.out.println("Empty block");
    }
    
    static void information() {
        System.out.println("Static method..");
    }
    
    public static void main(String...strings) {
        System.out.println("Main method...");
        //new Blocks();
    }
}
