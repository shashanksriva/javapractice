package com.shashank.designpatterns.visitor;

public class BikeVisitor implements Visitor {
    @Override
    public void visit(Car car) {
        System.out.println("Visiting Car");
        System.out.println("Start car checkup....");
        System.out.println("Check viper blades...");
        System.out.println("Check engine oil...");
        System.out.println("Check all 4 wheels");
    }

    @Override
    public void visit(Bike bike) {
        System.out.println("Visiting Bike");
        System.out.println("Start bike checkup....");
        System.out.println("Check viper blades...");
        System.out.println("Check engine oil...");
        System.out.println("Check all 4 wheels");
    }
}
