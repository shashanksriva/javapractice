package com.shashank.fresco;

import java.util.Optional;  
public class OptionalTypeDemo {  
    public static void main(String[] args) {  
        String[] str = new String[10];        
        str[5] = null;;
        str[4] = "JAVA OPTIONAL CLASS EXAMPLE";
        Optional<String> checkNull = Optional.ofNullable(str[5]);  
        if(checkNull.isPresent()){  // It Checks, value is present or not  
            String lowercaseString = str[5].toLowerCase();  
            System.out.print(lowercaseString);  
        }else  
            System.out.println("String value is not present");  
    }  
}  
