package com.company;

public class Fish extends Animal implements AnimalBehavior,AnimalMove{
    private String scaleColorShanjed56275;

    public Fish(){
        super();
        scaleColorShanjed56275= "NN";
    }

    public Fish(String nameShanjed56275, int ageShanjed56275 , int weightShanjed56275, String scaleColorShanjed56275){
        super(nameShanjed56275, ageShanjed56275, weightShanjed56275);
        this.scaleColorShanjed56275= scaleColorShanjed56275;
    }

    public Fish(int ageShanjed56275 , String scaleColorShanjed56275){
        super(ageShanjed56275);
        this.scaleColorShanjed56275=scaleColorShanjed56275;
    }

    public void drinkWaterShanjed56275(){
        System.out.println("Gulp gulp");
    }

    @Override
    public void getVoiceShanjed56275() {
        System.out.println("Fish is making sounds");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }

    @Override
    public void moveShanjed56275() {
        System.out.println("Fish is swimming");
    }

    @Override
    public void eatShanjed56275(String FoodName) {
        System.out.println("Fish is eating: "+ FoodName);
    }

    public String getScaleColorShanjed56275() {
        return scaleColorShanjed56275;
    }

    public void setScaleColorShanjed56275(String scaleColorShanjed56275) {
        this.scaleColorShanjed56275 = scaleColorShanjed56275;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "scaleColorShanjed56275='" + scaleColorShanjed56275 + '\'' +
                '}';
    }
}
