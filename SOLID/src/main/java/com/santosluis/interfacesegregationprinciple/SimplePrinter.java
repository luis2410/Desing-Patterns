package com.santosluis.interfacesegregationprinciple;

public class SimplePrinter implements Printer{
  @Override
  public void print() {
    System.out.println("printing");
  }
}
