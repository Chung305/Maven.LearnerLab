package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    @Test
    public void students(){
        Students students = Students.getInstance();

        for(int i = 0; i < 35; i++){
            students.add(new Student(i, "chung"+i));
        }

        Integer expected = 35;

        Assert.assertEquals(expected, students.count());


    }
}
