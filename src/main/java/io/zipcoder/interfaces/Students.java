package io.zipcoder.interfaces;

final class Students extends People<Student> {
    private static final Students INSTANCE = new Students();

    private Students(){
    }

    public static Students getInstance(){
        return INSTANCE;
    }

    public Student[] toArray(){

        return INSTANCE.toArray();
    }

}
