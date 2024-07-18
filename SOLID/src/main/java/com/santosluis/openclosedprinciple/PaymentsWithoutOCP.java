package com.santosluis.openclosedprinciple;

public class PaymentsWithoutOCP {

  public void CreditCardPayment(){
    System.out.println("Credit card used for purchased");
  }

  public void PayPalPayment(){
    System.out.println("Paypal used for purchased");
  }

  // This method was added after a new requirement so this breaks the OCP becuase class should be close for changes.
  public void QRPayment(){
    System.out.println("QR used for purchased");

  }

}
