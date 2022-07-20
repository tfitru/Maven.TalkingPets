package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        Pet x = new Pet();
        System.out.println("How many pets do you have?");
        x.setNumberOfPets(input);
        x.getNumberOfPets();
        System.out.println("What kind of pet? If more than one please continue pressing enter for each type.");
        x.setName(input);
        System.out.println("What's the name of each pet");
        x.setHoldType(input);
        x.displayNameAndSepakByType();


    }
}
