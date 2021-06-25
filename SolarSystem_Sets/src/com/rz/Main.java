package com.rz;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
  private static Map<String, HeavenObject> solarSystem = new HashMap<>();
  private static Set<HeavenObject> planets = new HashSet<>();


  public static void main(String[] args) {
    System.out.println("Heaven:");

    HeavenObject temp = new HeavenObject("Mercury", 86);
    solarSystem.put(temp.getName(), temp);
    planets.add(temp);

    temp = new HeavenObject("Venus", 158);
    solarSystem.put(temp.getName(), temp);
    planets.add(temp);

    temp = new HeavenObject("Earth", 365);
    solarSystem.put(temp.getName(), temp);
    planets.add(temp);
    //tempMoon init
    HeavenObject tempMoon = new HeavenObject("Moon", 27);
    solarSystem.put(tempMoon.getName(), tempMoon);
    //Moon to Earth
    temp.addMoon(tempMoon);

    //////////// Jupiter and moons
    temp = new HeavenObject("Jupiter", 4390);
    solarSystem.put(temp.getName(), temp);
    planets.add(temp);

    tempMoon = new HeavenObject("Io", 1.8);
    solarSystem.put(tempMoon.getName(), tempMoon);
    temp.addMoon(tempMoon);

    tempMoon = new HeavenObject("Europa", 3.9);
    solarSystem.put(tempMoon.getName(), tempMoon);
    temp.addMoon(tempMoon);

    tempMoon = new HeavenObject("Ganymede", 7.2);
    solarSystem.put(tempMoon.getName(), tempMoon);
    temp.addMoon(tempMoon);
    //////////////////


    temp = new HeavenObject("Uranus", 6070);
    solarSystem.put(temp.getName(), temp);
    planets.add(temp);

    temp = new HeavenObject("Neptune", 8550);
    solarSystem.put(temp.getName(), temp);
    planets.add(temp);

    temp = new HeavenObject("Pluto", 10990);
    solarSystem.put(temp.getName(), temp);
    planets.add(temp);


    HeavenObject sun = new HeavenObject("Sun", 0);
    solarSystem.put(sun.getName(), sun);


    System.out.println("All Planets (almost):");
    for (String object : solarSystem.keySet()) {
      System.out.println(object + ", ");
    }
//Jupiters moons
    HeavenObject jupiters = solarSystem.get("Jupiter");
    System.out.println("Moons of " + jupiters.getName() + " are ->");
    for (HeavenObject aMoon : jupiters.getSatellites()) {
      System.out.println("\t" + aMoon.getName());
    }

    // Getting all the moons of solarSystem
    Set<HeavenObject> moons = new HashSet<>();
    for (HeavenObject planet : planets) {
      moons.addAll(planet.getSatellites());
    }
    System.out.println("All Mooons: ");
    for (HeavenObject moon : moons) {
      System.out.println(moon.getName());
    }

//   for(String eachObject : solarSystem.keySet()){
//     if(eachObject.equals("Uranus")){
//       System.out.println(solarSystem.get(eachObject).getOrbitalPeriod());
//       break;
//     }
//   }


  }
}
