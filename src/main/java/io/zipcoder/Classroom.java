package io.zipcoder;

public class Classroom {

    Student[] students;

    public Classroom(int maxNumberOfStudents) {
    }
    public Classroom(Student[] classmates) {
        students = classmates;
    }
    public Classroom() {
        Student[] students = new Student[30];
    }

    public Student[] getStudents() {
        return students;
    }
    public double getAverageExamScoreStudents() {
        double testTotalSum = 0.0;
        int totalStudents = students.length;
        for (int i = 0; i < totalStudents; i++) {
            testTotalSum += students[i].getAverageExamScore();
        }
        return testTotalSum / totalStudents;
    }

}
