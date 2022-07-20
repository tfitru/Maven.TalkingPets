package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class HamsterTest {

    @Test
    public void speakTest() {
    // Given
    Hamster hamster = new Hamster();
    String expectedString = "squeak!";



    // When
    hamster.displaySpeak();


    // Then
    Assert.assertEquals(hamster.displaySpeak(), expectedString);

}



}
