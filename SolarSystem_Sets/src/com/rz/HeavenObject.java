package com.rz;

import java.util.HashSet;
import java.util.Set;

public final class HeavenObject {
  private final String name;
  private final double orbitalPeriod;
  private final Set<HeavenObject> satellites;


  public HeavenObject(String name, double orbitalPeriod) {
    this.name = name;
    this.orbitalPeriod = orbitalPeriod;
    this.satellites = new HashSet<HeavenObject>();
  }

  public String getName() {
    return name;
  }

  public double getOrbitalPeriod() {
    return orbitalPeriod;
  }

  public boolean addMoon(HeavenObject moon){
    return this.satellites.add(moon);
  }

  public Set<HeavenObject> getSatellites(){
    return new HashSet<>(this.satellites);
  }
}
