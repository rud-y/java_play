package com.rz.dogExample;

/**
 *
 */
public class DogMain {

  public static void main(String[] args) {

    Labrador lab = new Labrador("Ashi");
    Labrador lab2 = new Labrador("Ashi");
    Dog dog = new Dog("Ashi");

    System.out.println(lab.equals(dog));
    System.out.println(dog.equals(lab));

    System.out.println(lab.getClass());
    System.out.println(dog.getClass());

  }

}
