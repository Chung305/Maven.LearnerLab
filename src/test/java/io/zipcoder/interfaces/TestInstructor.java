package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(10, "Chung");

        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(10, "Chung");

        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        Instructor instructor = new Instructor(10, "Chung");
        Student student = new Student(1, "luke", 0.0);

        Double expected = 10.0;
        instructor.teach(student, expected);


        Assert.assertEquals(expected, student.getTotalStudyTime());
    }

    @Test
    public void testLecture(){
        Instructor instructor = new Instructor(10, "Chung");
        Student[] students = new Student[3];

        for(int i = 0; i < students.length; i++){
            students[i] = new Student((long)i, "chung"+i, 0.0);
        }

        instructor.lecture(students, 9);
        Double expected = 3.0;

        Assert.assertEquals(expected, students[0].getTotalStudyTime());

    }
}
