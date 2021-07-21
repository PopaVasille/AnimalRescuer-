
package org.example;


public class Doctor extends MedicalStaff {
   private double experienceYears;
    
    
public Doctor(String name, String specialization){
    super(name, specialization);    
}

    public double getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(double experienceYears) {
        this.experienceYears = experienceYears;
    }

}
