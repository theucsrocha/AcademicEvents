package com.trabalho1;

/**
 * Represents a student participant in the system.
 * Each student is associated with a university.
 */

public class Student extends People {
    
    private String university;

   public Student(String name, String university){
    super(name);
    this.university = university;
   }

   public String getUniversity() {
       return university;
   }

   public void setUniversity(String university) {
       this.university = university;
   }
    
}
