package com.santosluis.srp;

public class Director {

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
