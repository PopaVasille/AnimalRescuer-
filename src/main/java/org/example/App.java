package org.example;
import java.time.LocalDateTime;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Animal luck = new Animal("Luck");
        luck.age = 1;
        luck.LevelOfHealth = 10;
        luck.favoriteFood = "Royal Canin boabe";
        luck.moodLevel = 9;
        luck.feelingHungry = 1;
        luck.preferredRecreationalActivity = "Play cu gaina";
        
        RecreationActivity playCuGaina = new RecreationActivity("Play cu gaina");
        
        Rescuer bebe = new Rescuer("Bebe");
        bebe.amountAvailable = 100;
        
        PetFood boabe = new PetFood("Royal Canin");
        boabe.price = 15.23 ;
        boabe.quantity = 9.50;
        boabe.expiryDate  = LocalDateTime.of(2022,10,20,0,0);
        boabe.inStock = true;
        
        MedicalStaff drAnghel = new MedicalStaff("Anghel Rusu", "Medicina Generala");
        
        
        
        Game game = new Game();
        game.rescuer = bebe;
        game.animal = luck;
        game.medic = drAnghel;
        
                
        
    }
}
