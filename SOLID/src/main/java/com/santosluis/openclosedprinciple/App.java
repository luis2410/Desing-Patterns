package com.santosluis.openclosedprinciple;
/*
The Open/Closed Principle (OCP) states that software entities (classes, modules, functions, etc.) should be open for extension but closed for modification. This means that the behavior of a module can be extended without modifying its source code.

Advantages
Maintainability: Reduces the risk of introducing new bugs in existing code by avoiding modifications.
Scalability: Allows the system to grow by adding new functionality through extensions rather than changes.
Reusability: Promotes reusable code components that can be extended and customized.

 */
public class App {

  public static void main(String... args){

    //without OCP
    PaymentsWithoutOCP paymentsWithoutOCP = new PaymentsWithoutOCP();
    paymentsWithoutOCP.CreditCardPayment();
    paymentsWithoutOCP.PayPalPayment();


    //With COP
    Payments creditCardPayment = new CreditCardPayment();
    Payments palPayment = new PayPalPayment();
    creditCardPayment.paid();
    palPayment.paid();

    /*
    If bussines team decided that now we will acept QR payments this will happens:

    Without the OCP we would need to do a change in the PaymentsWithoutOCP class and this is not a good practice.

    With the OCP we would only need to create a new class QRPayment and implements Payments
     */

    //without OCP, we have added the below method to the class
    paymentsWithoutOCP.QRPayment();

    //With COP, we create a class that implement Payments and we didn't need to change the code.
    Payments qrPayment = new QRPayment();
    qrPayment.paid();
  }


}
