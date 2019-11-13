package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor(){
        Person person = new Person(10, "Chung");

        long expected = 10;
        String expected2 = "Chung";

        Assert.assertEquals(expected, person.getId());
        Assert.assertEquals(expected2, person.getName());
    }

    @Test
    public void testSetName(){
        Person person = new Person(10, "Chung");

        String expected = "Chungsing";
        person.setName(expected);

        Assert.assertEquals(expected, person.getName());
    }

}
