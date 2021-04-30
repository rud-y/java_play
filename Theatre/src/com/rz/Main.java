package com.rz;

import java.util.*;

public class Main {

  public static void main(String[] args) {

    Theatre theatre = new Theatre("Odeon", 10, 15);
//    theatre.getSeats();

    List<Seat> seatCopy = new ArrayList<Seat>(theatre.seats);
    printList(seatCopy);

    seatCopy.get(0).reserve();
    if (theatre.reserveSeat("C02")) {
      System.out.println("Please pay for C02");
    } else {
      System.out.println("Seat already reserved..");
    }

    if (theatre.reserveSeat("C02")) {
      System.out.println("Please pay for C02");
    } else {
      System.out.println("This seat already reserved..");
    }

//Reversed list
    Collections.reverse(seatCopy);
    System.out.println("Printing reversed seatCopy:");
    printList(seatCopy);
    System.out.println("Printing theatre.seats:");
    printList(theatre.seats);

    Seat minSeat = Collections.min(seatCopy);
    Seat maxSeat = Collections.max(seatCopy);
    System.out.println("Min seat number is--> " + minSeat.getSeatNumber());
    System.out.println("Max seat number is --> " + maxSeat.getSeatNumber());

    Collections.shuffle(seatCopy);
    System.out.println("Printin shuffled seatCopy::");
    printList(seatCopy);
    //Using sortList to sort items
    sortList(seatCopy);
    System.out.println("Printing sorted seatCopy: ");
    printList(seatCopy);
  }


  public static void printList(List<Seat> list) {
    for (Seat seat : list) {
      System.out.print(seat.getSeatNumber() + " ");
    }
    System.out.println();
    System.out.println("================================================");
  }
// Sorting a list (using compareTo)
  public static void sortList(List<? extends Seat> list) {
    for (int i = 0; i < list.size() - 1; i++) {
      for (int j = i + 1; j < list.size(); j++) {
        if (list.get(i).compareTo(list.get(j)) > 0) {
          Collections.swap(list, i, j);
        }
      }
    }
  }

}
