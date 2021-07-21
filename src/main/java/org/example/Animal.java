package org.example;


public class Animal {
    private String name;
    private int age;
    private int LevelOfHealth;
    private int feelingHungry;
    private int moodLevel;
    private String favoriteFood;
    private String preferredRecreationalActivity;
    
    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLevelOfHealth() {
        return LevelOfHealth;
    }

    public void setLevelOfHealth(int LevelOfHealth) {
        this.LevelOfHealth = LevelOfHealth;
    }

    public int getFeelingHungry() {
        return feelingHungry;
    }

    public void setFeelingHungry(int feelingHungry) {
        this.feelingHungry = feelingHungry;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = moodLevel;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getPreferredRecreationalActivity() {
        return preferredRecreationalActivity;
    }

    public void setPreferredRecreationalActivity(String preferredRecreationalActivity) {
        this.preferredRecreationalActivity = preferredRecreationalActivity;
    }
    
}
