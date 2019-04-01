package com.shashank.exceptions;

import java.rmi.activation.ActivationException;

public class NestedExceptions {
    
    String var = null;

    NestedExceptions() throws ActivationException{
        try {
            if(var == null) {
                throw new ActivationException("Activation exception encountered!");
            }
        }catch(ActivationException e){
            e.printStackTrace();
            
        }catch(Exception e){
            e.printStackTrace();
            throw new ActivationException("From catch block..");
        }
        System.out.println("Object instantiated!!");
    }
    
    public static void main(String...strings) {
        try {
            new NestedExceptions();
        } catch (ActivationException e) {
            System.out.println("Exception in main!");
            e.printStackTrace();
        }
    }
    
  
}
