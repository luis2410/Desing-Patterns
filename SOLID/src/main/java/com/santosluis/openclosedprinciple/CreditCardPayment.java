package com.santosluis.openclosedprinciple;

public class CreditCardPayment implements Payments {
  @Override
  public void paid() {
    System.out.println("Credit card used for purchased");
  }
}
