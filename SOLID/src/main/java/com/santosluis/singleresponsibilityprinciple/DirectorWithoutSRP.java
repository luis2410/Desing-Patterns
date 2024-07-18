package com.santosluis.singleresponsibilityprinciple;

class DirectorWithoutSRP {

  private long id;
  private String name;
  private int salary;

  public DirectorWithoutSRP(long id, String name, int salary) {
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

  // Method added, the class is doing more things that shouldn't be
  public String getDirectorCertifications(Director director){
    return String.format("Director with id : %d has these certifications: Java 21", director.getId());
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
