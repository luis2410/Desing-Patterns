package com.santosluis.interfacesegregationprinciple;

public class MultiFuncionalPrinter implements Scanner, Printer{
  @Override
  public void print() {
    System.out.println("MF is printing.");
  }

  @Override
  public void scan() {
    System.out.println("MF is scanning");
  }
}
