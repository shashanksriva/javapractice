package com.shashank.fresco;

import java.util.function.Consumer;
import java.util.function.Function;

interface Adder {
    String add(Function<String, String> f);
    void add(Consumer<Integer> f);
}
 
public class AdderExample implements Adder {
 
    @Override
    public  String add(Function<String, String> f) {
        return f.apply("Welcome ");
    }
 
    @Override
    public void add(Consumer<Integer> f) {
        
    }
    
    public static void main(String...strings) {
        
    }
}
