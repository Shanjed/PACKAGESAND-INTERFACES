package com.company;

public class Mammal extends Animal implements AnimalMove,AnimalName {

    private String orderShanjed56275;

    public Mammal(){
        super();
        orderShanjed56275 = "NN";
    }

    public Mammal(String nameShanjed56275, int ageShanjed56275 , int weightShanjed56275, String orderShanjed56275){
        super(nameShanjed56275, ageShanjed56275, weightShanjed56275);
        this.orderShanjed56275=orderShanjed56275;
    }

    public Mammal(int ageShanjed56275 , String orderShanjed56275){
        super(ageShanjed56275);
        this.orderShanjed56275=orderShanjed56275;
    }

    @Override
    public void moveShanjed56275() {
        System.out.println("Mammal is moving ");
    }

    public void drinkMilkShanjed56275(){
        System.out.println("Gulp gulp");
    }


    @Override
    public void getVoiceShanjed56275() {
        System.out.println("Mammal is making sounds");
    }

    @Override
    public void eatShanjed56275(String FoodName) {
        System.out.println("Mammal is eating: " + FoodName);
    }

    public String getOrderShanjed56275() {
        return orderShanjed56275;
    }

    public void setOrderShanjed56275(String orderShanjed56275) {
        this.orderShanjed56275 = orderShanjed56275;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "orderShanjed56275='" + orderShanjed56275 + '\'' +
                '}';
    }
}
