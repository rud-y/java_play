package com.rz._static;

public class StaticTest {
  //static variable
  private static int numInstances = 0;
  private String name;

  public StaticTest( String name) {
    //static variable, set to be increasing with each new instance of StaticTest class
    numInstances++;
    this.name = name;
  }

  public String getName() {
    return name;
  }
  //methods need to be declared 'static'
  public static int getNumInstances() {
    return numInstances;
  }
}
