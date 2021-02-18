package com.rz;

/**
 * Created by dev on 20/11/2015.
 */
public class SomeClass {

    private static int classCounter = 0;
    public final int instanceNumber;
    private final String name;


    //final var can change state but not cannot be assigned different object reference
    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(" SomeClass instance called " + name + " created, instanceNumber var is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
