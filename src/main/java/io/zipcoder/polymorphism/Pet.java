package io.zipcoder.polymorphism;


public abstract class Pet implements Comparable<Pet> {

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

    public void setName(String name) {
        this.name = name;
    }

}
