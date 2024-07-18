package com.santosluis.liskovsubstitutionprinciple;

public class MathTeacher implements Teacher{
  @Override
  public void applyExam() {
    System.out.println("Applying Maths Exam");
  }

  public void teachMath() {
    System.out.println("Teaching Maths");

  }
}
