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

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Matthew");

//        ArrayList<Integer> intArrayList  = new ArrayList<Integer>()
        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(50));
        Integer integer = new Integer(50);
        Double doubleValue =  new Double(20.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        for(int i = 0; i< 10; i++) {
            // Autoboxing
            intArrayList.add(Integer.valueOf(i));
        }

        for(int i = 0; i< 10; i++) {
            // Unboxing -intValue-
            System.out.println(i + ">>>" + intArrayList.get(i).intValue());

        }


        Integer myIntValue = 50; //Integer.valueOf(50);
        int myInt = myIntValue.intValue(); // myInt.intValue();


        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl=0; dbl<=10.0; dbl += 0.5){
            // Autoboxing
            myDoubleValues.add(Double.valueOf(dbl));
        }

        for(int i =0; i<myDoubleValues.size(); i ++){
            // Unboxing -double value-
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i +" >>>" + value);
        }



    }
}
