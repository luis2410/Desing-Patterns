package com.santosluis.dependencyinversionprinciple;
/*
Dependency Inversion Principle (DIP): High-level modules should not depend on low-level modules.
Both should depend on abstractions. Additionally, abstractions should not depend on details.
Details should depend on abstractions. This promotes loose coupling between different parts of
the system.
*/
public class App {

  public static void main(String... args) {
    SystemNotificationService systemNotificationService;
    /*
    The DIP says that we need to decouple the high level modules from the low level modules

    SystemNotificationService is the high level module

    SNSNotification and SNSNotification are low level modules

    SystemNotificationService is not couple to a single module because we can create a instance of
    SystemNotificationService sending as argument either SNS or SQS notifications modules, in case business needs
    another typo of notification SystemNotificationService should be able to accept it.
     */
    SNSNotification snsNotification = new SNSNotification();
    systemNotificationService = new SystemNotificationService(snsNotification);
    systemNotificationService.sendNotification();

    SQSNotification sqsNotification = new SQSNotification();
    systemNotificationService = new SystemNotificationService(sqsNotification);
    systemNotificationService.sendNotification();

  }


}
