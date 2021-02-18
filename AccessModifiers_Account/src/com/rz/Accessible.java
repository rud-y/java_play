package com.rz;

// What access do following methods and variables have?
// public, 'package-private', protected, private

interface Accessible {
  int SOME_CONSTANT = 10;
  public void aMethod();
  void bMethod();
  boolean cMethod();
}

// A: interface is by default public
// B: all interface variables are public/static/constant !
// C: methods bMethod and cMethod would be package-private but as they are part of an interface
// they are public by default

