package com.rz;

import java.util.*;

public class Theatre {
  private final String theatreName;
  private ArrayList<Seat> seats = new ArrayList<Seat>();

  //COMPARATOR!
  static final Comparator<Seat> PRICE_ORDER;

  static {
    PRICE_ORDER = new Comparator<Seat>() {
      @Override
      public int compare(Seat seat1, Seat seat2) {
        if (seat1.getPrice() < seat2.getPrice()) {
          return -1;
        } else if (seat1.getPrice() > seat2.getPrice()) {
          return 1;
        } else {
          return 0;
        }
      }
    };
  }

  // Constructor (based on num of rows and row seats) !
  public Theatre(String theatreName, int numRows, int seatsPerRow) {
    this.theatreName = theatreName;

    int lastRow = 'A' + (numRows - 1);
    // Iterating through the rows(A,B,C..) and row seat numbers
    for (char row = 'A'; row <= lastRow; row++) {
      for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
        double price = 12.00;

        if ((row < 'D') && (seatNum > 4 && seatNum < 13)) {
          price = 14.00;
        } else if ((row > 'H') || (seatNum <= 4 || seatNum >= 13)) {
          price = 7.00;
        }
        Seat seat = new Seat(row + String.format("%02d", seatNum), price);
        seats.add(seat);
      }
    }
  }

  public boolean reserveSeat(String seatNumber) {
// binarySearch
    Seat requestedSeat = new Seat(seatNumber,0);
    int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
    if (foundSeat >= 0) {
      return seats.get(foundSeat).reserve();
    } else {
      System.out.println("There is no seat no.: " + seatNumber);
      return false;
    }

    //binarySearch2 - dots represent number of searches until seat is found
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


// LINEAR SEARCH
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


  /////for testing purposes
  public Collection<Seat> getSeats() {
    return seats;
  }

  public String getTheatreName() {
    return theatreName;
  }

}

