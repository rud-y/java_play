package com.rz._static;

public class Main {
    public static int multiplier = 5;

    // java com.company._static.Main  --> 'Main' class name is a convention
    // java expects Main to have a 'static method main'
    public static void main(String[] args) {
//        StaticTest firstInstance = new StaticTest("1st Instance");
//        System.out.println(firstInstance.getName() + " has instance number " + firstInstance.getNumInstances());
//
//        StaticTest secondInstance = new StaticTest("2nd Instance");
//        System.out.println(secondInstance.getName() + " has instance number " + StaticTest.getNumInstances());
//
//        StaticTest thirdInstance = new StaticTest("3rd Instance");
//        System.out.println(thirdInstance.getName() + " has instance number " + thirdInstance.getNumInstances());

        int answer = multiply(4);
        System.out.println("The multiplied number is: " + answer);
        System.out.println("Multiplier is: " + multiplier);
    }
    public static int multiply(int number) {
        return number * multiplier;
    }

}

