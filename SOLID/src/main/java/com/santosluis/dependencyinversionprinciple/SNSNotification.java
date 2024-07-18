package com.santosluis.dependencyinversionprinciple;

public class SNSNotification implements SystemNotification{
  @Override
  public void sendNotification() {
    System.out.println("Sending a SNS notification");
  }
}
