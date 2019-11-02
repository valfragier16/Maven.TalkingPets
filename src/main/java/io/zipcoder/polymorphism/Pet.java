package io.zipcoder.polymorphism;

public class Pet {
    private String name;

    public Pet(String name){
        this.name = name;
    }
    public String name(){
        return name;
    }

    public String speak(){
        return "You know what im saying";
    }

    public String getName() {
        return name;
    }
}