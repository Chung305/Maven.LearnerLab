package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class testInstructors {

    @Test
    public void testing(){
        Instructors instructors = Instructors.getInstance();
        Integer instructorCount = 5;

        for(int i = 0;  i < instructorCount; i++){
            instructors.add(new Instructor(i , "chung"+i));
        }


        Assert.assertEquals(instructorCount, instructors.count());
    }
}
