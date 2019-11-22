package com.shashank.corejava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

    
    public static void main(String...strings) {
        
        /*String text = "--------------------------------------------------------------------------------\r\n" + 
                "Port         Name               Status             Reason\r\n" + 
                "--------------------------------------------------------------------------------\r\n" ;
                                
                "--------------------------------------------------------------------------------\r\n" + 
                "Port         Name               Err-Vlans                     Status\r\n" + 
                "--------------------------------------------------------------------------------\r\n"
                +"kjfjhsjakfjkakk"
                ;*/
        
        String text = "^M^M\r\n" + 
                "^M\r\n" + 
                "--------------------------------------------------------------------------------^M\r\n" + 
                "Port         Name               Status             Reason^M\r\n" + 
                "--------------------------------------------------------------------------------^M\r\n" + 
                "^M";
        String pattern = "\\-+\\sPort.*\\s\\-+\\s*?(?![\\s\\S])";
        
        Matcher matcher = Pattern.compile(pattern).matcher(text);
        System.out.println("Find: " + matcher.find());
        
    }
}
