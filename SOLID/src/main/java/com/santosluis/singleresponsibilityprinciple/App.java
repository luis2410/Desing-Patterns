package com.santosluis.singleresponsibilityprinciple;

/*
Definition
The Single Responsibility Principle (SRP) states that a class should have only one reason to change, meaning it should have only one job or responsibility.

Advantages
Maintainability: Easier to understand, maintain, and modify the code.
Reusability: Classes with well-defined responsibilities are easier to reuse in different contexts.
Testability: Classes with a single responsibility are easier to test because their interfaces are simpler.
*/

/*
We have an App that does the calculation for the taxes of a Director and also we query the DT to get it email address.
There are 2 classes that controls the business logic
1 - NotSingleResponsibility : This use a class the is called DirectorWithoutSRP where it does all the logic so far
needed.

2 - SingleResponsibility : This class descompose the DirectorWithoutSRP into smaller classes with a single
responsibility.
 */
public class App {

  public static void main(String... arg){

    // Logic without SRP
    DirectorWithoutSRP directorWithoutSRP = new DirectorWithoutSRP(123, "luis", 12000);
    Double grossSalary = directorWithoutSRP.calculateGrossSalary(directorWithoutSRP.getSalary());
    System.out.printf("The gross Salary is : $%.2f%n", grossSalary);
    String email = directorWithoutSRP.getEmailById(directorWithoutSRP.getId());
    System.out.printf("The email address is : %s%n", email);

    // Logic with SRP,
    Director director = new Director(123, "luis", 12000);
    DirectorSalaryCalculator directorSalaryCalculator = new DirectorSalaryCalculator();
    DirectorRepository directorRepository = new DirectorRepository();
    Double grossSalary2 = directorSalaryCalculator.calculateGrossSalary(director);
    System.out.printf("The gross Salary is : $%.2f%n", grossSalary2);
    String email2 = directorRepository.getEmailById(director);
    System.out.printf("The email address is : %s%n", email);

    /* So far both logics but what if the business requirements changes, and they decide that we need to print in
     console the Director's certifications that exist in some DB in the cloud.

    We have 2 options:
    1 -  Create a extra class.
    2 -  Update the DirectorWithoutSRP to perform this task.

    If we apply the first option will work for both scenarios with and without SRP but in the case of Without SRP the
    code would like more confused and hard to read, if we do this for SRP we will have utility classes that do just a
    single task and this is what SRP mean.

    if we apply the 2 second option it will break the SRP because we are adding responsibilities to a class that
    already have other responsibilities.
    */

    // Logic without SRP, We need to modify the DirectorWithoutSRP to get the certifications, this is not good.
    String certifications = directorWithoutSRP.getDirectorCertifications(director);
    System.out.println(certifications);

    // Logic with SRP, We create a new class that only responsibility is to get the certifications from cloud.
    DirectorCertifications directorCertifications = new DirectorCertifications();
    String certifications2 = directorCertifications.getDirectorCertifications(director);
    System.out.println(certifications2);
  }
}
