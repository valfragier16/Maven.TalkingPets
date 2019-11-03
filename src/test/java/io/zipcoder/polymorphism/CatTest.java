package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void speakTest() {
        Cat testCat = new Cat("Tiger");
        String expected = "meow";
        String actual = testCat.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nameTest(){
        // Given
        Cat testCat = new Cat("Tiger");
        String expectedName = "Tiger";
        // When
        String actualName = testCat.getName();
        // Then
        Assert.assertEquals(expectedName, actualName);
    }

}
