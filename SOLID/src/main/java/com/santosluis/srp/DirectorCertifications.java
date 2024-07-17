package com.santosluis.srp;

public class DirectorCertifications {
  public String getDirectorCertifications(Director director){
    return String.format("Director with id : %d has these certifications: Java 21", director.getId());
  }
}
