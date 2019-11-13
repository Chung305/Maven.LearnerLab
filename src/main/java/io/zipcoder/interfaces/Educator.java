package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    KRIS(new Instructor(1, "kris"), 0.0),
    DOLIO(new Instructor( 2, "Dolio"), 0.0),
    FROILEN(new Instructor(3, "Froilan"), 0.0);

    private final Instructor instructor;
    private  Double timeWorked;

    Educator(Instructor a, Double timeWorked) {
        this.instructor = a;
        this.timeWorked = timeWorked;
        Instructors instructors = Instructors.getInstance();
        instructors.add(instructor);

    }

    public void teach(Learner learner, double numberOfHours) {
        this.instructor.teach(learner, numberOfHours);
    }

    public void lecture(Learner[] leaner, double numberOfHours) {
        this.instructor.lecture(leaner, numberOfHours);
    }
}
