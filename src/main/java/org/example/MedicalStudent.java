
package org.example;


public class MedicalStudent extends MedicalStaff {
    private int yearsOfStudy;
    
 public MedicalStudent(String name, String specialization){
     super(name, specialization);
 }

    public int getYearsOfStudy() {
        return yearsOfStudy;
    }

    public void setYearsOfStudy(int yearsOfStudy) {
        this.yearsOfStudy = yearsOfStudy;
    }
 
}
