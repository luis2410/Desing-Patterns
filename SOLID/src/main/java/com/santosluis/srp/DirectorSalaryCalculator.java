package com.santosluis.srp;

class DirectorSalaryCalculator {
  public double calculateGrossSalary(Director director){
    return director.getSalary()*.16; // some calculation to add the taxes to the salary.
  }

}
