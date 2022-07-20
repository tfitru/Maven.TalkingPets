package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {


    @Test
    public void catSpeakTest() {
        // Given
        Cat cat = new Cat();
        String catSpeak = "meow!";

        // When
        cat.displaySpeak();


        //Then
        Assert.assertEquals(cat.displaySpeak(), catSpeak);



    }
}
