package com.shashank.designpatterns.visitor;

public interface Visitor {

    void visit(Car car);

    void visit(Bike bike);
}
