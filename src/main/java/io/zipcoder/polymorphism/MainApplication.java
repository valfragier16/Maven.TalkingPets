package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 11/6/17.
 */

public class MainApplication {
    public static void main(String[] args){
        Integer prompt = Console.getIntegerInput("How many pets do you have? ");

        List<Pet> petsLog = new ArrayList<Pet>();

        if(prompt > 0){
            for(int i = 0; i < prompt; i++){
                String petValue = Console.getStringInput("What kind of animal are they? ");
                String nameValue = Console.getStringInput("What are their names?");
                String petList = petValue + " : " + nameValue;
                petsLog.add(petList);
            }
            System.out.println("\n Your pets: \n\n" + petsLog + "\n\n I love animals!");
        }
    }




}
