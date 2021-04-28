package com.rz;

public class Seat {

  private final String seatNumber;
  private boolean reserved = false;


  public Seat(String seatNumber) {
    this.seatNumber = seatNumber;
  }

  public  boolean reserve() {
    if(!this.reserved){
      this.reserved = true;
      System.out.println("Seat " + seatNumber + " is reserved.");
      return true;
    } else {
      return false;
    }
  }


  public boolean cancel() {
    if(this.reserved){
      this.reserved = false;
      System.out.println("Reservation of seat " + seatNumber + " was cancelled " );
      return true;
    } else {
      return false;
    }
  }

  public String getSeatNumber() {
    return seatNumber;
  }
}
