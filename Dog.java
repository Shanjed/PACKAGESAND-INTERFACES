package com.company;

public class Dog extends Mammal implements AnimalBehavior,AnimalMove{
    private String breedShanjed56275;

    Dog(){
        super();
        breedShanjed56275= "NN";
    }

    public Dog(String nameShanjed56275 , int ageShanjed56275,int weightShanjed56275,String rzadShanjed56275, String breedShanjed56275){
        super(nameShanjed56275,ageShanjed56275,weightShanjed56275,rzadShanjed56275);
        this.breedShanjed56275=breedShanjed56275;
    }

    public Dog(int ageShanjed56275, String rzadShanjed56275, String breedShanjed56275){
        super(ageShanjed56275,rzadShanjed56275);
        this.breedShanjed56275=breedShanjed56275;
    }

    public void sportShanjed56275(){
        System.out.println("The dog is retrieving.");
    }

    @Override
    public void drinkMilkShanjed56275() {
        System.out.println("The dog is drinking milk.");
    }

    @Override
    public void getVoiceShanjed56275() {
        System.out.println("The dog is barking.");
    }

    @Override
    public void eatShanjed56275(String FoodName) {
        System.out.println("The dog is eating: "+ FoodName);
    }

    @Override
    public void sleep() {
        System.out.println("ZZZ");
    }

    @Override
    public void moveShanjed56275() {
        System.out.println("Dog is running");
    }

    public String getBreedShanjed56275() {
        return breedShanjed56275;
    }

    public void setBreedShanjed56275(String breedShanjed56275) {
        this.breedShanjed56275 = breedShanjed56275;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breedShanjed56275='" + breedShanjed56275 + '\'' +
                '}';
    }
}
