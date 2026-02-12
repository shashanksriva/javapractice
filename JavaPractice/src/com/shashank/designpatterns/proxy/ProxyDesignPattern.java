package com.shashank.designpatterns.proxy;


// 2. Real Subject


// 4. Client Code (Demonstration)
public class ProxyDesignPattern {
    public static void main(String[] args) {
        // Image creation using the Proxy (loading doesn't happen yet)
        Image image = new ProxyImage("my_vacation_photo.jpg");

        System.out.println("--- First call to display ---");
        // Real image is created and loaded *only now*
        image.display();

        System.out.println("\n--- Second call to display ---");
        // Image is already loaded and just displayed directly
        image.display();

        System.out.println("Runtime" + Runtime.getRuntime());
    }
}
