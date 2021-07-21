
package org.example;


public class Dog extends Animal{
    private double barkPower;
    
 public Dog(String name){
     super(name);
 }
 public void setBarkPower(double barkPower){
     this.barkPower = barkPower;
 }
 public double getBarkPower(){
     return barkPower;
 }
}
