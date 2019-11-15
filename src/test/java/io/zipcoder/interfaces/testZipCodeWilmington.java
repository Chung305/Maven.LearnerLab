package io.zipcoder.interfaces;

import org.junit.Test;

public class testZipCodeWilmington {

    @Test
    public void testHostLecture(){

        ZipCodeWilmington.getInstance().hostLectures(Educator.KRIS, 100);


        System.out.println(ZipCodeWilmington.getInstance().getStudyMap().toString());
    }

}
