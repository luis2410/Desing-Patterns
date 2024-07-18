package com.santosluis.liskovsubstitutionprinciple;

public class SpanishTeacher implements Teacher{
  @Override
  public void applyExam() {
    System.out.println("Applying Spanish Exam");
  }

  public void teachSpanish() {
    System.out.println("Teaching Spanish");

  }
}
