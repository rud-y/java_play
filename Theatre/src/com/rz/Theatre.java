package com.rz;

import java.util.*;

public class Theatre {
  private final String theatreName;
  private List<Seat> seats = new ArrayList<Seat>();

  // Constructor
  public Theatre(String theatreName, int numRows, int seatsPerRow) {
    this.theatreName = theatreName;

    int lastRow = 'A' + (numRows - 1);
    // Iterating through the rows(A,B,C..) and row numbers
    for (char row = 'A'; row <= lastRow; row++) {
      for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
        Seat seat = new Seat(row + String.format("%02d", seatNum));
        seats.add(seat);
      }
    }
  }

  public String getTheatreName() {
    return theatreName;
  }

  public boolean reserveSeat(String seatNumber) {

    //binarySearch2 - dots signal number of searches until seat is found
//    int low = 0;
//    int high = seats.size()-1;
//
//    while (low <= high) {
//      System.out.print(".");
//      int mid = (low + high) / 2;
//      Seat midVal = seats.get(mid);
//      int cmp = midVal.getSeatNumber().compareTo(seatNumber);
//
//      if (cmp < 0) {
//        low = mid + 1;
//      } else if (cmp > 0) {
//        high = mid - 1;
//      } else {
//        return seats.get(mid).reserve();
//      }
//    }
//    System.out.println("There is no seat " + seatNumber);
//    return false;

// binarySearch
    Seat requestedSeat = new Seat(seatNumber);
    int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
    if (foundSeat >= 0) {
      return seats.get(foundSeat).reserve();
    } else {
      System.out.println("There is no seat no.: " + seatNumber);
      return false;
    }

// linear search
//    Seat requestedSeat = null;
//    for(Seat seat : seats){
//
//      System.out.println(".");
//      if(seat.getSeatNumber().equals(seatNumber)){
//        requestedSeat = seat;
//        break;
//      }
//    }
//    if(requestedSeat == null) {
//      System.out.println("The seat number " + seatNumber + " is not available" );
//      return false;
//    }
//    return requestedSeat.reserve();

  }


  /////testing purposes
  public void getSeats() {
    for (Seat seat : seats) {
      System.out.println(seat.getSeatNumber());
    }
  }


}
