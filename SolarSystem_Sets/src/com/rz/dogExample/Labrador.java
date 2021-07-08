package com.rz.dogExample;

public class Labrador extends Dog {

  public Labrador(String name){
    super(name);
  }

  // Can't override equals/hashcode in Dog subclass (as Dog equals(..) is final
//  @Override
//  public boolean equals(Object obj) {
//    if(this == obj){
//      return true;
//    }
//    if(obj instanceof Labrador){
//      String objName = ((Labrador) obj).getName();
//      return this.getName().equals(objName);
//    }
//    return false;
//  }

}
