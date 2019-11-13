package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class testZipCodeWilmington {

    @Test
    public void testHostLecture(){

        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();
        Teacher teacher = new Instructor(0, "chung");

        zipCodeWilmington.hostLectures(teacher, 90);




    }
}
