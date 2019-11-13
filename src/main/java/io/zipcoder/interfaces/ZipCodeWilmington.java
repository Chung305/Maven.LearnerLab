package io.zipcoder.interfaces;

final class ZipCodeWilmington {
    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();




    public void hostLectures(Teacher teacher, double numberOfHours){

        teacher.lecture(students.toArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){

        Teacher teacher = new Instructor(id,"chung");

        teacher.lecture(students.toArray(), numberOfHours);

    }
    public Double getStudyMap(){
        Student student = new Student(0 , "Chung", 0);

        return student.getTotalStudyTime();
    }

}
