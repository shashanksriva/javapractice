package com.shashank.designpatterns.visitor;

public class Car implements Vehicle{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
