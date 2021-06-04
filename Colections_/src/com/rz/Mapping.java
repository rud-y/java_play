package com.rz;

import java.util.*;

public class Mapping {

  public static void main(String[] args) {
    Map<String, String> nhlTeams = new HashMap<>();
    nhlTeams.put("Montreal", "MTL");
    nhlTeams.put("Toronto", "TOR");
    nhlTeams.put("St. Louis", "STL");
    nhlTeams.put("New York Islanders", "NYI");
    nhlTeams.put("Edmonton Oilers", "EDM");
    nhlTeams.put("Phoenix", "PHX");
    nhlTeams.put("Florida Panthers", "FLA");

    System.out.println(nhlTeams.keySet());
//    System.out.println("REMOVED: " +nhlTeams.remove("St. Louis"));
    List<String> list = new ArrayList<>();
    for (String key : nhlTeams.keySet()) {
      if (key.contains(" ")) {
        list.add(key);
      }
    }
    System.out.println("Keys with more than one word: " + list);
    List<String> sortedList = new ArrayList<String>(list);
    Collections.sort(sortedList);
    System.out.println("Sorted alphabetically: " +sortedList);
  }

}


