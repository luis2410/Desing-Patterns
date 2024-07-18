package com.santosluis.openclosedprinciple;

public class PayPalPayment implements Payments{
  @Override
  public void paid() {
    System.out.println("Paypal used for purchased");
  }
}
