package com.rz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
//    locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
//    locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
//    locations.put(2, new Location(2, "You are at the top of a hill"));
//    locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
//    locations.put(4, new Location(4, "You are in a valley beside a stream"));
//    locations.put(5, new Location(5, "You are in the forest"));

    //tempExit - possible exits for each of the locations
    Map<String, Integer> tempExit = new HashMap<String, Integer>();
    locations.put(0, new Location(0, "You are sitting in front of a computer learning Java", null));

    //1
    tempExit.put("W", 2);
    tempExit.put("E", 3);
    tempExit.put("S", 4);
    tempExit.put("N", 5);
    tempExit.put("NE", 6);
    locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempExit));

    //2
    tempExit = new HashMap<String, Integer>();
    tempExit.put("N", 5);
    locations.put(2, new Location(2, "You are at the top of a hill", tempExit));

    //3
    tempExit = new HashMap<String, Integer>();
    tempExit.put("W", 1);
    locations.put(3, new Location(3, "You are inside a building, a well house for a small spring", tempExit));

    //4
    tempExit = new HashMap<String, Integer>();
    tempExit.put("N", 1);
    tempExit.put("W", 2);
    locations.put(4, new Location(4, "You are in a valley beside a stream", tempExit));

    //5
    tempExit = new HashMap<String, Integer>();
    tempExit.put("S", 1);
    tempExit.put("W", 2);
    locations.put(5, new Location(5, "You are in the forest", tempExit));

    //6
    tempExit = new HashMap<String, Integer>();
    tempExit.put("S", 1);
    locations.put(6, new Location(6, "You are on the Raven island.", tempExit));


    //Mapping possible exits from 'current locations' (DIAGRAM)
//    locations.get(1).addExit("W", 2);
//    locations.get(1).addExit("E", 3);
//    locations.get(1).addExit("S", 4);
//    locations.get(1).addExit("N", 5);
//
//    locations.get(2).addExit("N", 5);
//
//    locations.get(3).addExit("W", 1);
//
//    locations.get(4).addExit("N", 1);
//    locations.get(4).addExit("W", 2);
//
//    locations.get(4).addExit("N", 1);
//    locations.get(4).addExit("W", 2);
//
//    locations.get(5).addExit("S", 1);
//    locations.get(5).addExit("W", 2);
//        locations.get(5).addExit("Q", 0);



    //Extended  (for inputs other than single letters)
    Map<String, String> vocabulary = new HashMap<String, String>();
    vocabulary.put("QUIT", "Q");
    vocabulary.put("SOUTH", "S");
    vocabulary.put("NORTH", "N");
    vocabulary.put("EAST", "E");
    vocabulary.put("WEST", "W");
    vocabulary.put("NORTHEAST", "NE");


    int loc = 1;
    while (true) {
      System.out.println(locations.get(loc).getDescription());
//      tempExit.remove("S");

      if (loc == 0) {
        break;
      }
      Map<String, Integer> exits = locations.get(loc).getExits();
      System.out.print("Available exits are: ");
      for (String exit : exits.keySet()) {
        System.out.print(exit + ", ");
      }
      System.out.println();

      System.out.println("Enter a direction you want to go:");
      String direction = sc.nextLine().toUpperCase();
      //Relates to 'vocabulary Map' - checking when user enters more than one string ('n', 'west', 'e',--> 'go north', 'lets go east', etc)
      if (direction.length() > 1) {
        String[] words = direction.split(" ");
        for (String word : words) {
          if (vocabulary.containsKey(word)) {
            direction = vocabulary.get(word);
            break;
          }
        }
      }
    //
      if (exits.containsKey(direction)) {
        loc = exits.get(direction);
      } else {
        System.out.print("You cannot go that direction! ");
      }


      if (!locations.containsKey(loc)) {
        System.out.println("You can't go that direction !!!");
      }
    }
  }
}
