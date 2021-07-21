package org.example;
import java.time.LocalDateTime;
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
        
        Rescuer bebe = new Rescuer();
        bebe.name = "Bebe";
        bebe.amountAvailable = 100;
        
        PetFood boabe = new PetFood();
        boabe.name = "Royal Canin";
        boabe.price = 15.23 ;
        boabe.quantity = 9.50;
        boabe.expiryDate  = LocalDateTime.of(2022,10,20,0,0);
        boabe.inStock = true;
        
        MedicalStaff drAnghel = new MedicalStaff();
        drAnghel.name = "Anghel Rusu";
        drAnghel.specialization = "medicina generala";
        
        
        Game game = new Game();
        game.rescuer = bebe;
        game.animal = luck;
        game.medic = drAnghel;
        
                
        
    }
}
