package com.company;

public class BlowFish extends Fish implements AnimalBehavior, AnimalMove{
    private int diameterShanjed56275;

    BlowFish(){
        super();
        diameterShanjed56275=10;
    }

    public BlowFish(String nameShanjed56275String , int ageShanjed56275 , int weightShanjed56275, String scaleColorShanjed56275, int diameterShanjed56275){
        super(nameShanjed56275String,ageShanjed56275,weightShanjed56275,scaleColorShanjed56275);
        this.diameterShanjed56275=diameterShanjed56275;

    }

    @Override
    public void moveShanjed56275() {
        System.out.println("Blowfish is swimming");
    }

    @Override
    public void sleep() {
        System.out.println("ZZZ");
    }

    public BlowFish(int ageShanjed56275, String scaleColorShanjed56275, int diameterShanjed56275){
        super(ageShanjed56275, scaleColorShanjed56275);
        this.diameterShanjed56275=diameterShanjed56275;
    }

    public void swimShanjed56275(){
        System.out.println("The BlowFish is swimming upstream");
    }

    @Override
    public void eatShanjed56275(String FoodName) {
        System.out.println("The BlowFish is eating: "+ FoodName);
    }

    @Override
    public void getVoiceShanjed56275() {
        System.out.println("The blowfish is howling");
    }

    public int getDiameterShanjed56275() {
        return diameterShanjed56275;
    }

    public void setDiameterShanjed56275(int diameterShanjed56275) {
        this.diameterShanjed56275 = diameterShanjed56275;
    }

    @Override
    public String toString() {
        return "BlowFish{" +
                "diameterShanjed56275=" + diameterShanjed56275 +
                '}';
    }
}
