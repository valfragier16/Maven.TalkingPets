package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DragonTest {
    @Test
    public void setNameTest1(){
        Dragon testDragon = new Dragon ("Drago");
        String expectedName = "Drago";
        String actualName = testDragon.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setSpeakTest2() {
        Dragon testDragon = new Dragon("Drago");
        String expected = "RAWWRRRR!";
        String actual = testDragon.speak();
        Assert.assertEquals(expected, actual);
    }
}
