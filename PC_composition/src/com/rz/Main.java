package com.rz;

public class Main {

  public static void main(String[] args) {
    Dimensions dimensions = new Dimensions(20, 30, 5);
    Case theCase = new Case("222B", "Dell", "240", dimensions);
    Monitor theMonitor = new Monitor("29inch Beast", "Acer", 27, new Resolution(2540, 1440));
    Motherboard theMotherboard = new Motherboard("BJ-500", "Asus", 4, 3, "v4.44");

    // new PC object
    PC thePC = new PC(theCase, theMonitor, theMotherboard);

    thePC.getTheCase().pressPowerButton();
    thePC.getMonitor().drawPixelAt(1500, 1100, "blue");
    thePC.getMotherboard().loadProgram("Windows 10");

  }
}
