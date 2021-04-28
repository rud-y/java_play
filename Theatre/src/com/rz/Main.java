package com.rz;

public class Main {

  public static void main(String[] args) {

    Theatre theatre = new Theatre("Odeon", 10, 15);
    theatre.getSeats();

    if (theatre.reserveSeat("A15")) {
      System.out.println("please pay");
    } else {
      System.out.println("Sorry, this seat is taken!");
    }

    if (theatre.reserveSeat("A15")) {
      System.out.println("please pay");
    } else {
      System.out.println("Sorry, this seat is taken!");
    }


  }
}
