
package org.example;


public class MedicalStaff {
    private String name;
    private String specialization;
    
    
 public MedicalStaff(String name, String specialization){
     this.name= name;
     this.specialization = specialization;
 }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
 
}
