package com.company;

abstract class Animal implements AnimalMove ,AnimalName{
    private String nameShanjed56275;
    private int ageShanjed56275;
    private int weightShanjed56275;

    public Animal(){
        ageShanjed56275 = weightShanjed56275 = 10;
        nameShanjed56275 = "NN";
    }

    public Animal(String nameShanjed56275 ,int ageShanjed56275 , int weightShanjed56275){
        this.nameShanjed56275 = nameShanjed56275;
        this.ageShanjed56275= ageShanjed56275;
        this.weightShanjed56275= weightShanjed56275;
    }

    public Animal(int ageShanjed56275){
        this.ageShanjed56275=ageShanjed56275;
    }

    public abstract void eatShanjed56275(String FoodName);

    public abstract void moveShanjed56275();

    public abstract void getVoiceShanjed56275();

    public String getNameShanjed56275() {
        return nameShanjed56275;
    }

    public void setNameShanjed56275(String nameShanjed56275) {
        this.nameShanjed56275 = nameShanjed56275;
    }

    public int getAgeShanjed56275() {
        return ageShanjed56275;
    }

    public void setAgeShanjed56275(int ageShanjed56275) {
        this.ageShanjed56275 = ageShanjed56275;
    }

    public int getWeightShanjed56275() {
        return weightShanjed56275;
    }

    public void setWeightShanjed56275(int weightShanjed56275) {
        this.weightShanjed56275 = weightShanjed56275;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nameShanjed56275='" + nameShanjed56275 + '\'' +
                '}';
    }
}