package com.santosluis.srp;

public class singleResponsibility {

  public static void main(String... arg){

    Director director = new Director(123, "luis", 12000);
    DirectorSalaryCalculator directorSalaryCalculator = new DirectorSalaryCalculator();
    DirectorRepository directorRepository = new DirectorRepository();
    Double grossSalary = directorSalaryCalculator.calculateGrossSalary(director);
    System.out.printf("The gross Salary is : %.2f", grossSalary);
    String email = directorRepository.getEmailById(director);
    System.out.printf("The email address is : %s%n", email);


  }

  // This class does not apply the simple responsibility principle because it does more task that it should.
/*  public class Director{

    private long id;
    private String name;
    private int salary;

    public Director(long id, String name, int salary) {
      this.id = id;
      this.name = name;
      this.salary = salary;
    }

    public String getEmailById(long id){
      // Emulate a call to the DB and returns an email address.
      return ("Luis.santos@gmail.com");
    }

    public double calculateGrossSalary(int salary){
      return salary*.16; // some calculation to add the taxes to the salary
    }

    public long getId() {
      return id;
    }

    public void setId(long id) {
      this.id = id;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getSalary() {
      return salary;
    }

    public void setSalary(int salary) {
      this.salary = salary;
    }
  }*/
}

// To accomplish the SRP we need to segregate the class into smaller classes
class Director{
  private long id;
  private String name;
  private int salary;

  public Director(){};

  public Director(long id, String name, int salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }
}

class DirectorSalaryCalculator {
  public double calculateGrossSalary(Director director){
    return director.getSalary()*.16; // some calculation to add the taxes to the salary.
  }

}

class DirectorRepository {
  public String getEmailById(Director director){
    // Emulate a call to the DB and returns an email address.
    return (String.format("Luis.santos@gmail.com for id : %d", director.getId()));
  }
}