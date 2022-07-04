package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String inputUserPet = "";
//        System.out.println("How many pets do you have?");
//        int inputUser = input.nextInt();
//        System.out.println("What kind of pet? If more than one please continue pressing enter for each type.");
//        ArrayList<String> inputUserPetHold = new ArrayList<>(30);
//        for(int i = 0; i<inputUser; i++) {
//            inputUserPet = input.next();
//            inputUserPetHold.add(inputUserPet);
//        }

        Scanner input = new Scanner(System.in);


        Pet x = new Pet();
        System.out.println("How many pets do you have?");
        x.setNumberOfPets(input);
        x.getNumberOfPets();
        System.out.println("What kind of pet? If more than one please continue pressing enter for each type.");
        x.setName(input);
        x.getName();
        x.getNameOfPetsHold();
        System.out.println(x.getNameOfPetsHold());
        System.out.println(x.getSoundHold());



//        System.out.println("User's pet is: " + inputUserPetHold.toString());


    }
}
