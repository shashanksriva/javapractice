package com.shashank.exceptions;

public class ExceptionsTest {
    
    public static void main(String...strings) {
        
        method1();
    }
    
    private static void method1() {
        
        try {
            throw new Exception();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally {
            System.out.println("Exception Encountered");
        }
    }

}
