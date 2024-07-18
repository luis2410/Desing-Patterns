package com.santosluis.dependencyinversionprinciple;

public class SystemNotificationService implements SystemNotification{

  private SystemNotification systemNotification;
  public SystemNotificationService(SystemNotification systemNotification){
    this.systemNotification = systemNotification;
  }

  @Override
  public void sendNotification() {
    systemNotification.sendNotification();
  }
}
