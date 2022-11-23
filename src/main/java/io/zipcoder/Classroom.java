package io.zipcoder;

public class Classroom {

    Student[] students;

    public Classroom(int maxNumberOfStudents) {
    }
    public Classroom(Student[] students) {
    }
    public Classroom() {
        Student[] students = new Student[30];
    }

    public Student[] getStudents() {
        return students;
    }


}
