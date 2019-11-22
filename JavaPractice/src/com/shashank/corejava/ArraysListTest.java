package com.shashank.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysListTest {
    
    static String [] nameArray = { "Shashank", "Slesha", "Pankhul", "Vikrant"};
    
    
    public static void main(String...strings) {
        
        List<String> nameList = Arrays.asList(nameArray);
        
        System.out.println(nameList.getClass().getName());
        
        nameList = new ArrayList<String>(nameList);
        
        nameList.add("dfja");
    }

}
