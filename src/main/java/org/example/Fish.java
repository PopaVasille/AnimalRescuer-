
package org.example;


public class Fish extends Animal{
    private int wingsCount;

    public Fish(String name) {
        super(name);
    }

    public int getWingsCount() {
        return wingsCount;
    }

    public void setWingsCount(int wingsCount) {
        this.wingsCount = wingsCount;
    }
    
}
