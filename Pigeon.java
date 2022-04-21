package com.company;

public class Pigeon extends Bird implements AnimalMove, AnimalBehavior{
    private String speciesShanjed56275;

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }

    @Override
    public void moveShanjed56275() {
        System.out.println("Pigeon is flying");
    }

    Pigeon(){
        super();
        speciesShanjed56275="NN";
    }

    public Pigeon(String nameShanjed56275, int ageShanjed56275, int weightShanjed56275, String featherColorShanjed56275, String speciesShanjed56275){
        super(nameShanjed56275, ageShanjed56275, weightShanjed56275,featherColorShanjed56275);
        this.speciesShanjed56275= speciesShanjed56275;
    }

    public Pigeon(int ageShanjed56275, String featherColorShanjed56275, String speciesShanjed56275){
        super(ageShanjed56275, featherColorShanjed56275);
        this.speciesShanjed56275=speciesShanjed56275;
    }

    public void peckingWoodShanjed56275(){
        System.out.println("The Pigeon is pecking wood");
    }

    @Override
    public void getVoiceShanjed56275() {
        System.out.println("The Pigeon chirps");
    }

    @Override
    public void eatShanjed56275(String FoodName) {
        System.out.println("The Pigeon is eating: "+ FoodName);
    }

    public String getSpeciesShanjed56275() {
        return speciesShanjed56275;
    }

    public void setSpeciesShanjed56275(String speciesShanjed56275) {
        this.speciesShanjed56275 = speciesShanjed56275;
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "speciesShanjed56275='" + speciesShanjed56275 + '\'' +
                '}';
    }
}
