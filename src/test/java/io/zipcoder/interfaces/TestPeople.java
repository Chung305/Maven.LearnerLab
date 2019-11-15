package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd(){
        People people = new ConcretePeople();

        Instructor instructor = new Instructor(0, "Chung");
        Student student = new Student(1, "Chungsing");

        people.add(student);
        people.add(instructor);

        Integer expected = 2;

        Assert.assertEquals(expected, people.count());
    }

    @Test
    public void testRemove(){
        People people = new ConcretePeople();
        Instructor instructor = new Instructor(0, "Chung");
        Student student = new Student(1, "Chungsing");

        people.add(student);
        people.add(instructor);



        people.remove(instructor);
        people.remove(student);

        Integer expected = 0;

        Assert.assertEquals(expected, people.count());

    }

    @Test
    public void testFindById(){
        People people = new ConcretePeople();
        Instructor instructor = new Instructor(0, "Chung");
        Student student = new Student(1, "Chungsing");

        people.add(student);
        people.add(instructor);

        Assert.assertEquals(student, people.findById(1));
    }

}
