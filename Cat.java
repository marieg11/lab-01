package com.example.petshop;

public class Cat extends Pet implements Pettable{
    public Cat(String name) {
        super(name);
    }
    @Override
    public String speak() {
        return "meow";
    }

    @Override
    public void pet() {
        System.out.println("Cat accepts pet");
    }
}

