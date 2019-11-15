package io.zipcoder.interfaces;

import org.junit.Test;

public class testZipCodeWilmington {

    @Test
    public void testHostLecture(){

        ZipCodeWilmington a = ZipCodeWilmington.getInstance();


        a.hostLectures(Educator.KRIS, 90);

        System.out.println(a.getStudyMap());
    }

}
