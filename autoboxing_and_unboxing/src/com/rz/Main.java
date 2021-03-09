package com.rz;
import java.lang.reflect.Array;
import java.util.ArrayList;


class IntClass {
    private int myValue;

    public IntClass(int aValue) {
        this.myValue = aValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}


public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[5];
        int[] intArray = new int[5];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Matthew");

//        ArrayList<Integer> intArrayList  = new ArrayList<Integer>()
        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(50));
        Integer integer = new Integer(50);
        Double doubleValue =  new Double(20.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();




    }
}
