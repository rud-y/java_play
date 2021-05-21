package com.rz;

import java.util.*;

public class Main {
  public static void main(String[] args) {

    Theatre theatre = new Theatre("Odeon", 10, 16);
//    theatre.getSeats();

//    List<Seat> seatCopy = new ArrayList<Seat>(theatre.getSeats());
//    printList(seatCopy);


    if (theatre.reserveSeat("C10")) {
      System.out.println("Please pay for C10");
    } else {
      System.out.println("Seat already reserved..");
    }

    if (theatre.reserveSeat("C10")) {
      System.out.println("Please pay for f-16");
    } else {
      System.out.println("This seat already reserved..");
    }

    List<Seat> priceSeats = new ArrayList<Seat>(theatre.getSeats());
    priceSeats.add(new Seat("A00", 19.00));
    priceSeats.add(new Seat("B00", 1.00));
    Collections.sort(priceSeats, Theatre.PRICE_ORDER);
    printList(priceSeats);


// MAX AND MIN SEAT NUMBER( ROW AND SEATNUMBER)
//    Seat minSeat = Collections.min(seatCopy);
//    Seat maxSeat = Collections.max(seatCopy);
//    System.out.println("Min seat number is--> " + minSeat.getSeatNumber());
//    System.out.println("Max seat number is --> " + maxSeat.getSeatNumber());
//
//    Collections.shuffle(seatCopy);
//    System.out.println("Printin shuffled seatCopy::");
//    printList(seatCopy);

//    //Using sortList to sort items
//    sortList(seatCopy);
//    System.out.println("Printing sorted seatCopy: ");
//    printList(seatCopy);
  }

  // PRINT LIST OF ALL SEATS WITH PRICE
  public static void printList(List<Seat> list) {
    for (Seat seat : list) {
      System.out.println(seat.getSeatNumber() + " " + seat.getPrice());
    }
    System.out.println();
    System.out.println("================================================");
  }
// Sorting a list (using compareTo)!
//  public static void sortList(List<? extends Seat> list) {
//    for (int i = 0; i < list.size() - 1; i++) {
//      for (int j = i + 1; j < list.size(); j++) {
//        if (list.get(i).compareTo(list.get(j)) > 0) {
//          Collections.swap(list, i, j);
//        }
//      }
//    }
//  }

}
