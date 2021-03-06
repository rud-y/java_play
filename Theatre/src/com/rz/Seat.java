package com.rz;

//Having overridden compareTo(Seat seat) method
//Needs to implement Comparable
public class Seat implements Comparable<Seat> {

  private String seatNumber;
  private boolean reserved = false;
  private double price;

  public Seat(String seatNumber, double price) {
    this.seatNumber = seatNumber;
    this.price = price;
  }

  @Override
  public int compareTo(Seat seat) {
    return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
  }

  public boolean reserve() {
    if (!this.reserved) {
      this.reserved = true;
      System.out.println("Seat " + seatNumber + " is reserved.");
      return true;
    } else {
      return false;
    }
  }

  public boolean cancel() {
    if (this.reserved) {
      this.reserved = false;
      System.out.println("Reservation of seat " + seatNumber + " was cancelled ");
      return true;
    } else {
      return false;
    }
  }

  public String getSeatNumber() {
    return seatNumber;
  }

  public double getPrice() {
    return price;
  }
}
