package com.santosluis.openclosedprinciple;

public class QRPayment implements Payments{
  @Override
  public void paid() {
    System.out.println("QR used for purchased");
  }
}
