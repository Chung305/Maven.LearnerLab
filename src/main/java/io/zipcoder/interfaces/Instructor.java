package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {


    public Instructor(long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] leaner, double numberOfHours) {
        double numberOfHoursPerLeaner = numberOfHours / leaner.length;

        for(Learner each : leaner)
            each.learn(numberOfHoursPerLeaner);
    }
}
