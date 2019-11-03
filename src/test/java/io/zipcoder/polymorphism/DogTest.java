package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void setNameTest1(){
        Dog testDog = new Dog ("Bobby");
        String expectedName = "Bobby";
        String actualName = testDog.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setSpeakTest2() {
        Dog testDog = new Dog("Bobby");
        String expected = "bark bark";
        String actual = testDog.speak();
        Assert.assertEquals(expected, actual);
    }
}
