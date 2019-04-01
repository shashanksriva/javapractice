package com.equinix.bitset;

import java.util.BitSet;

public class BitSetImplementation {

    private BitSet bitset;

    /**
     * Creates BitSet with default size of 24 bits
     */
    public BitSetImplementation() {
        bitset = new BitSet(24);
    }

    /**
     * Creates BitSet with given size
     * @param size
     */
    public BitSetImplementation(int size) {
        bitset = new BitSet(size);
    }

    /**
     * Sets interface to be set, implies that interface id is not available
     * @param bitIndex
     */
    void setInterfaceInUse(int bitIndex) {
        //System.out.println("Setting Interface::" + bitIndex);
        bitset.set(bitIndex);
    }
    
    /**
     * Clears set flag for an interface, making it available for configuration
     * @param bitIndex
     */
    void clearInterface(int bitIndex) {
        bitset.clear(bitIndex);
    }

    /**
     * Returns next available interface
     * @return
     */
    int getNextAvailableInterface() {
        return bitset.nextClearBit(1);
    }
    
    boolean getStatusOfInterface(int index) {
        System.out.println(bitset.toString());
        return bitset.get(index);
    }

}
