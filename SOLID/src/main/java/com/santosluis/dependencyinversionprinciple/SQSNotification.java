package com.santosluis.dependencyinversionprinciple;

public class SQSNotification implements SystemNotification{
  @Override
  public void sendNotification() {
    System.out.println("Send SQS notification");
  }
}
