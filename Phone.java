package com.alevel.homework06;

public class Phone {
    public long number;
    public String model;
    public float weight;
    public String name;



    //е)
    public Phone(long number, String model, float weight){

    }

//е)
    public Phone(long number, String model){

    }

    //ж)
    public Phone() {

    }

    public void introduce() {
        System.out.println("The Iphone model: " + model + " , number: " + number + " , weight : " + weight + "g");
    }


    public void receiveCall(String name) {
        this.name = name;
        System.out.println(this.name + " calling you!");
    }


    public void getNumber() {
        System.out.println("Your number " + number);
    }


}
