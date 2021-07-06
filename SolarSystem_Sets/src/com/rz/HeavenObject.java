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


  @Override // to override the method needs to have the same signature as equals /not as before: 'HeavenlyObject' type
  public boolean equals(Object obj){
    if(this == obj){
      return true;
    }
    System.out.println("obj.getClass()" + obj.getClass());
    System.out.println("this.getClass()" + this.getClass());

    if((obj == null) || (obj.getClass() != this.getClass())){
      return false;
    }

    String objName = ((HeavenObject) obj).getName();
    return this.name.equals(objName);
  }


  @Override //
  public int hashCode() {
    System.out.println("Hashcode called");
    return this.name.hashCode();
  }
}
