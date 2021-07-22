
package org.example;


public class Rescuer {
    private String name;
    private double amountAvailable;
    
    public Rescuer (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmountAvailable() {
        return amountAvailable;
    }

    public void setAmountAvailable(double amountAvailable) {
        this.amountAvailable = amountAvailable;
    }
    
    public void feedAnimal(Animal animal, PetFood food){
        System.out.println(this.name + " la hranit pe "+ animal.getName()+ " cu "+ food.getName()+" !");
    }
    public void doStuff(Animal animal, RecreationActivity recreationActivity){
        System.out.println(this.name + " s-a jucat impreuna cu "+ animal.getName()+" activitatea lui preferata, si anume "+ recreationActivity.getName()+" !");
    }
}
