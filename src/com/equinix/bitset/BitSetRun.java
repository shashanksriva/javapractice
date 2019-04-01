package com.equinix.bitset;

import java.nio.ByteBuffer;
import java.util.List;
import javax.activation.DataHandler;

/**
 * Class to test BitSet implementation of interface handling
 * @author shashasr
 *
 */
public class BitSetRun {

    private static BitSetImplementation bitsetImplementaion;
    
    

    public static void main(String...strings) {
        
        int [] bitArray = new int[24];
        
        for(int bitArrayElem : bitArray){
            System.out.print(bitArrayElem);
        }
        
        
    }

    private static void createInterface(List<Integer> interfacesList) {
        System.out.println("Creating interfaces..");
        for(int i : interfacesList) {
            bitsetImplementaion.setInterfaceInUse(i);
        }
    }

    private static void addInterface(int interfaceId) {
        if(interfaceId != bitsetImplementaion.getNextAvailableInterface()) {
            System.out.println("ERROR:: Given interface:"+interfaceId+ " doesn't match next available interface:" + bitsetImplementaion.getNextAvailableInterface());
        }else if(bitsetImplementaion.getStatusOfInterface(interfaceId)){
            System.out.println("ERROR:: Iinterface:"+interfaceId+ " already exists.");
        }else {
            bitsetImplementaion.setInterfaceInUse(interfaceId);
            System.out.println("Added interface:" + interfaceId);
        }
    }

    private static void removeInterface(int interfaceId) {
        //If it's true remove else throw an error
        if(bitsetImplementaion.getStatusOfInterface(interfaceId)) {
            bitsetImplementaion.clearInterface(interfaceId);
            System.out.println("Removed interface:" + interfaceId);
        }else {
            System.out.println("ERROR:: Given interface does not exist.");
        }
    }

}

/*int numberOfInterfaces = 254;
bitsetImplementaion = new BitSetImplementation(numberOfInterfaces);

List<Integer> interfacesList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

createInterface(interfacesList);
System.out.println("Next Available Interface:: "+ bitsetImplementaion.getNextAvailableInterface());

addInterface(8);
System.out.println("Next Available Interface:: "+ bitsetImplementaion.getNextAvailableInterface());

addInterface(6);
System.out.println("Next Available Interface:: "+ bitsetImplementaion.getNextAvailableInterface());

removeInterface(5);
System.out.println("Next Available Interface:: "+ bitsetImplementaion.getNextAvailableInterface());

removeInterface(5);

removeInterface(1);
System.out.println("Next Available Interface:: "+ bitsetImplementaion.getNextAvailableInterface());*/
