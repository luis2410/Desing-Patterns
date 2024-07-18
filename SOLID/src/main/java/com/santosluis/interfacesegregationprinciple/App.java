package com.santosluis.interfacesegregationprinciple;
/*
The Interface Segregation Principle (ISP) promotes the creation of specific and small interfaces
instead of a large, monolithic interface. This ensures that clients do not depend on methods
they do not use, thereby promoting higher cohesion, lower coupling, and facilitating easier
maintenance and expansion of the code.
 */
public class App {
  public static void main(String... arg) {
    /*
    SimplePrinter implements Printer only, SimplePrinter can't scan so we didn't add Scanner Interface
     */
    SimplePrinter simplePrinter = new SimplePrinter();
    simplePrinter.print();
    /*
    SimpleScanner implements Scanner only, SimpleScanner can't print so we didn't add Printer Interface
     */
    SimpleScanner simpleScanner = new SimpleScanner();
    simpleScanner.scan();
    /*
    MultifunctionalPrinter implements Scanner and Printer because this kind of printer can scan and print so methods
    should be inherit.
     */
    MultiFuncionalPrinter multiFuntionalPrinter = new MultiFuncionalPrinter();
    multiFuntionalPrinter.print();
    multiFuntionalPrinter.scan();



  }
}
