package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pet {


    private String displayNameandType;

    private String name;
    private String type;
    private int numberOfPet;

    private List<String> pet = new ArrayList<>();
    private List<String> sound = new ArrayList<>();

    private List<String> hold = new ArrayList<>();

    private List<String> holdType = new ArrayList<>();


    public Pet() {
        displayNameandType = "";
        type = "";
        name = "";
        numberOfPet = Integer.MAX_VALUE;


    }

    public Pet(String name, String type, Integer numberOfPet) {
        this.name=name;
        this.type=type;
        this.numberOfPet=numberOfPet;
    }

    public void setName(Scanner name){
        for(int i = 0; i<numberOfPet; i++) {
            this.name = name.next();
            this.pet.add(this.name);

        }

    }

    public void setNumberOfPets(Scanner numberOfPets){
        this.numberOfPet = numberOfPets.nextInt();
    }

    public String getName(){
        System.out.println(name);
        return this.name;
    }

    public Integer getNumberOfPets(){return this.numberOfPet;}
    public List<String> getNameOfPetsHold() {
        return pet;
    }


    public void setHoldType(Scanner input) {
        for(int i = 0; i<this.numberOfPet; i++) {
            this.type = input.next();
            this.sound.add(this.type);
        }
    }

   public String getType() {
        return this.type;
   }


   public  String displaySpeak() {
       return "";
   }

   public String displayNameAndSepakByType(){
        Dog dog = new Dog();
        Cat cat = new Cat();
        Hamster hamster = new Hamster();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i<this.pet.size(); i++){
            if(this.pet.get(i).equalsIgnoreCase("dog")){
                str.append(this.sound.get(i));
                str.append(",");
                str.append(dog.displaySpeak());
                str.append(" ");

            }
        }

        for(int i = 0; i<this.pet.size(); i++){
            if(this.pet.get(i).equalsIgnoreCase("cat")){
                str.append("  ");
                str.append(this.sound.get(i));
                str.append(",");
                str.append(cat.displaySpeak());
            }
        }

        for(int i = 0; i<this.pet.size(); i++){
            if(this.pet.get(i).equalsIgnoreCase("hamster")){
                str.append("  ");
                str.append(this.sound.get(i));
                str.append(",");
                str.append(hamster.displaySpeak());
            }
        }

        System.out.println(str);

        return this.displayNameandType = String.valueOf(str);
   }




   // for every pet type print the animal noise with the name



}
