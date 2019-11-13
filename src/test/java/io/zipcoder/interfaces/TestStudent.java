package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;



public class TestStudent {

    @Test
    public void testImplementation(){
        Student student = new Student(10, "chung", 10.0);

        Assert.assertTrue(student instanceof Learner);

    }

    @Test
    public void testInheritance(){
        Student student = new Student(10, "Chung", 10.0);

        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        Student student = new Student(10, "Chung", 10.0);

        Double expected = 12.0;
        student.learn(2.0);

        Assert.assertEquals(expected, student.getTotalStudyTime());
    }
}