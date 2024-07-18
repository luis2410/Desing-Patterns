package com.santosluis.singleresponsibilityprinciple;

public class DirectorRepository {

  public String getEmailById(Director director){
    // Emulate a call to the DB and returns an email address.
    return (String.format("Luis.santos@gmail.com for id : %d", director.getId()));
  }

}
