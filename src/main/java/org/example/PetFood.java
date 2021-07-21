
package org.example;

import java.time.LocalDateTime;


public class PetFood {
    String name;
    double price;
    double quantity;
    LocalDateTime expiryDate;
    boolean inStock;
    
    public PetFood(String name){
        this.name = name;
    }
}
