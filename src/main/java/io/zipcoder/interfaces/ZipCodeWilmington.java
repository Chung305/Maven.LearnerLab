package io.zipcoder.interfaces;

import java.util.HashMap;

final class ZipCodeWilmington {
    private final static ZipCodeWilmington zipCode = new ZipCodeWilmington();
    private  Students students;
    private  Instructors instructors;

    private ZipCodeWilmington(){
        students = Students.getInstance();
        instructors = Instructors.getInstance();

    }


    public void hostLectures(Teacher teacher, double numberOfHours){

        teacher.lecture(students.toArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){

        Teacher teacher = new Instructor(id,"chung");

        teacher.lecture(students.toArray(), numberOfHours);

    }
    public HashMap<Student, Double> getStudyMap(){
        HashMap<Student, Double> studyMap = new HashMap<Student, Double>();

        for(Object student: students){
            Student a = (Student) student;
            studyMap.put(a, a.getTotalStudyTime());
        }
        return studyMap;
    }

    public static  ZipCodeWilmington getInstance(){
        return zipCode;
    }

}
