package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetTests {

    Pet pet = new Pet();

    @Test
    public void nullaryPetConstructor() {
        //Given
        String displayNameAnType = "";
        String type = "";
        String name = "";
        Integer numberOfPet = Integer.MAX_VALUE;


        pet.getName();
        pet.getNumberOfPets();
        pet.getType();
        pet.displayNameAndSepakByType();


        Assert.assertEquals(displayNameAnType, pet.displayNameAndSepakByType());
        Assert.assertEquals(type, pet.getType());
        Assert.assertEquals(name, pet.getName());
        Assert.assertEquals(numberOfPet, pet.getNumberOfPets());


    }


    @Test
    public void constructorTest() {
        // Given
        String name = "Zack";
        String type = "dog";
        Integer numberOfPet = 5;
        Pet pet1 = new Pet(name, type, numberOfPet);

        // When



        // Then
        Assert.assertEquals(pet1.getName(), name);
        Assert.assertEquals(pet1.getType(), type);
        Assert.assertEquals(pet1.getNumberOfPets(), numberOfPet);
    }

    @Test
    public void testDisplayNameAndType() {
        // Given
        Dog dog = new Dog();
        Cat cat = new Cat();
        Hamster hamster = new Hamster();
        List<String> sound = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        List<String> pet = new ArrayList<>();
        pet.add("dog");
        pet.add("cat");
        pet.add("hamster");

        sound.add("frank");
        sound.add("bob");
        sound.add("billy");


        for(int i = 0; i<pet.size(); i++){
        if(pet.get(i).equalsIgnoreCase("dog")){
            str.append(sound.get(0));
            str.append(",");
            str.append(dog.displaySpeak());
            str.append(" ");

        }
    }
        for(int i = 0; i<pet.size(); i++){
        if(pet.get(i).equalsIgnoreCase("cat")){
            str.append("  ");
            str.append(sound.get(1));
            str.append(",");
            str.append(cat.displaySpeak());
        }
    }

        for(int i = 0; i<pet.size(); i++){
        if(pet.get(i).equalsIgnoreCase("hamster")){
            str.append("  ");
            str.append(sound.get(2));
            str.append(",");
            str.append(hamster.displaySpeak());
        }
    }



        System.out.println(str);

        Assert.assertEquals(str, str);

    }

    @Test
    public void testHoldType() {
        // Given

        Integer numberOfPet = 5;
        String type = "dog";
        List<String> sound = new ArrayList<>();

        // When
        for(int i =0; i<numberOfPet; i++){
            sound.add(type);
        }


        // Then
        Assert.assertEquals(sound.get(0), type);



    }

    @Test
    public void testDisplaySpeak() {
        // Given
        String displaySpeak = "";



        // When
        pet.displaySpeak();



        // Then
        Assert.assertEquals(pet.displaySpeak(), displaySpeak);


    }






}
