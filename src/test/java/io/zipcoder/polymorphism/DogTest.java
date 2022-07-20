package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void dogSpeakTest() {
        // Given
        Dog dog = new Dog();
        String dogSpeak = "bark";

        // When
        dog.displaySpeak();


        // Then
        Assert.assertEquals(dog.displaySpeak(), dogSpeak);
    }
}
