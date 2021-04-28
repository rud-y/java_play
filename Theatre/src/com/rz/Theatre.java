package com.rz;
import java.util.*;

public class Theatre {
  private final String theatreName;
  private Collection<Seat> seats = new LinkedHashSet<>();

  public Theatre(String theatreName, int numRows, int seatsPerRow) {
    this.theatreName = theatreName;

    int lastRow = 'A' + (numRows - 1);
    // Iterating through the rows(A,B,C..) and row numbers
    for(char row = 'A'; row <= lastRow; row++){
      for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++){
        Seat seat = new Seat(row + String.format("%02d", seatNum));
        seats.add(seat);
      }
    }
  }


  public String getTheatreName() {
    return theatreName;
  }

  public boolean reserveSeat(String seatNumber) {
    Seat requestedSeat = null;
    for(Seat seat : seats){
      if(seat.getSeatNumber().equals(seatNumber)){
        requestedSeat = seat;
        break;
      }
    }
    if(requestedSeat == null) {
      System.out.println("The seat number " + seatNumber + " is not available" );
      return false;
    }

    return requestedSeat.reserve();
  }

  /////testing purposes
  public void getSeats() {
    for(Seat seat : seats){
      System.out.println(seat.getSeatNumber());
    }
  }


}
