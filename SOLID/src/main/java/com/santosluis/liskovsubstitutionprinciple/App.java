package com.santosluis.liskovsubstitutionprinciple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
The Liskov Substitution Principle (LSP) states that objects of a superclass should be replaceable
with objects of a subclass without affecting the program's correctness, ensuring subclasses
adhere to the expected behavior and interface of the superclass.
 */
public class App {

  public static void main(String... args) {

    // All the instances are using the base class
    Teacher chemestryTeacher = new ChemistryTeacher();
    Teacher spanishTeacher = new SpanishTeacher();
    Teacher mathTeacher = new MathTeacher();

    /*
    because all are from the same base class we can add them into a list and do iterations,
    also we can do a cast to call a specific method from each sub class.
    */
    List<Teacher> teacherList = new ArrayList<>();
    Collections.addAll(teacherList, chemestryTeacher,spanishTeacher,mathTeacher);
    for(Teacher t : teacherList) {
      if(t instanceof ChemistryTeacher){
        ((ChemistryTeacher) t).teachChemistry();
      } else if (t instanceof SpanishTeacher) {
        ((SpanishTeacher) t).teachSpanish();
      } else if (t instanceof MathTeacher) {
        ((MathTeacher) t).teachMath();
      }
      t.applyExam();
    }





  }
}
