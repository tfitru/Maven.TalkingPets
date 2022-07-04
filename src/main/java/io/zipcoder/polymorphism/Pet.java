package io.zipcoder.polymorphism;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Pet {


    Scanner input = new Scanner(System.in);

    private String name;
    private int numberOfPet;

    private ArrayList<String> pet;
    private ArrayList<String> sound = new ArrayList<>(30);

    private ArrayList<String> hold = new ArrayList<>(30);


    public Pet() {
        name = "";
        numberOfPet = Integer.MAX_VALUE;


    }

    public Pet(String name) {
        this.name=name;
    }


    public void setName(Scanner name){
        for(int i = 0; i<numberOfPet; i++) {
            this.name = name.next();
            setNamOfPetHold(hold);
            setSoundHold(sound);
        }

    }
    public void setNamOfPetHold(ArrayList<String> pets){
            pets.add(this.name);
            this.pet = pets;

    }
    public void setSoundHold(ArrayList<String> sounds){
        Dog x = new Dog();
        Cat y = new Cat();
        Hamster v = new Hamster();
        for(int i = 0; i<pet.size(); i++) {
            if(pet.get(i).equalsIgnoreCase("Dog")) {
                sounds.add(x.displaySpeak());
            } else if(pet.get(i).equalsIgnoreCase("Cat")) {
                sounds.add(y.displaySpeak());
            } else if(pet.get(i).equalsIgnoreCase("Hamster")){
                sounds.add(v.displaySpeak());
            }
        }
        this.sound = sounds;


    }

    public void setNumberOfPets(Scanner numberOfPets){
        this.numberOfPet = numberOfPets.nextInt();
    }



    public void run(){

//        String inputUserPet = "";
//        System.out.println("How many pets do you have?");
//        int inputUser = input.nextInt();
//        System.out.println("What kind of pet? If more than one please continue pressing enter for each type.");
//        ArrayList<String> inputUserPetHold = new ArrayList<>(30);
//        ArrayList<String> inputUserPetHoldSound = new ArrayList<>(30);
//        for(int i = 0; i<inputUser; i++) {
//            inputUserPet = input.next();
//            inputUserPetHold.add(inputUserPet);
//            if(inputUserPet.equalsIgnoreCase("Dog")) {
//                inputUserPetHoldSound.add(x.displaySpeak());
//            } else if(inputUserPet.equalsIgnoreCase("Cat")){
//                inputUserPetHoldSound.add(y.displaySpeak());
//            } else if (inputUserPet.equalsIgnoreCase("Hamster")){
//                inputUserPetHoldSound.add(v.displaySpeak());
//            }
//        }
//        System.out.println(inputUserPetHold.toString());
//        System.out.println(inputUserPetHoldSound);

    }

    public String getName(){
        System.out.println(name);
        return this.name;
    }
    public Integer getNumberOfPets(){return numberOfPet;}
    public ArrayList<String> getNameOfPetsHold() {
        return pet;
    }

    public ArrayList<String> getSoundHold(){
        Dog x = new Dog();
        Cat y = new Cat();
        Hamster v = new Hamster();
        ArrayList<String> userPetSound = new ArrayList<>(30);

        return sound;
    }


   public  String displaySpeak() {
       return "";
   }
}
