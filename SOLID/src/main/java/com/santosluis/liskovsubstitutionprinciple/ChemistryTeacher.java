package com.santosluis.liskovsubstitutionprinciple;

public class ChemistryTeacher implements Teacher {
  @Override
  public void applyExam() {
    System.out.println("Applying Chemistry Exam");
  }

  public void teachChemistry() {
    System.out.println("Teaching Chemistry");

  }
}
