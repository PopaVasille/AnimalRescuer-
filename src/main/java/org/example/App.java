package org.example;
import java.util.Date;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Animal luck = new Animal();
        luck.name = "Luck";
        luck.age = 1;
        luck.LevelOfHealth = 10;
        luck.favoriteFood = "Royal Canin boabe";
        luck.moodLevel = 9;
        luck.feelingHungry = 1;
        luck.preferredRecreationalActivity = "Play cu gaina";
        
        RecreationActivity playCuGaina = new RecreationActivity();
        playCuGaina.name = "Play cu gaina";
        
        Adoption bebe = new Adoption();
        bebe.name = "Bebe";
        bebe.amountAvailable = 100;
        
        PetFood boabe = new PetFood();
        boabe.name = "Royal Canin";
        boabe.price = 15.23 ;
        boabe.quantity = 9.50;
        boabe.expirationDate = new Date(30,05,2022);
        boabe.availabilityInStock = 23;
        
        Veterinarian drAnghel = new Veterinarian();
        drAnghel.name = "Anghel Rusu";
        drAnghel.specialization = "medicina generala";
        
        
                
        
    }
}
