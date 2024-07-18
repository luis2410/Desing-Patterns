package com.santosluis.interfacesegregationprinciple;

public class SimpleScanner implements Scanner{
  @Override
  public void scan() {
    System.out.println("scaning");
  }
}
