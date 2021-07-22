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
        luck.setAge(1);
        luck.setLevelOfHealth(10);
        luck.setFavoriteFood("Royal Canin boabe");
        luck.setMoodLevel(9);
        luck.setFeelingHungry(1);
        luck.setPreferredRecreationalActivity("Play cu gaina de cauciuc");
        
        
        RecreationActivity playCuGaina = new RecreationActivity("Play cu gaina");
        
        Rescuer bebe = new Rescuer("Bebe");
        
        bebe.setName("Bebe");
        
        PetFood boabe = new PetFood("Royal Canin");
        boabe.setPrice(15.23);
        boabe.setQuantity(9.50);       
        boabe.setExpiryDate(LocalDateTime.of(2021,12,7,0,0));
        boabe.setInStock(true);
        
        MedicalStaff drAnghel = new MedicalStaff("Anghel Rusu", "Medicina Generala");
        
        
        
        Game game = new Game();
        game.rescuer = bebe;
        game.animal = luck;
        game.medic = drAnghel;
        
        bebe.feedAnimal(luck, boabe);
        bebe.doStuff(luck, playCuGaina);
        
    }
}
