package io.zipcoder;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;

public class StudentTest extends TestCase {

    public void testSetExamScores() {
    }

    public void testGetFirstName() {
        Double [] exams = {100.0, 95.0};
        Student student = new Student("John", "Morris", exams);
        String expected = "John";
        String actual = student.getFirstName();
        Assert.assertEquals(expected, actual);
    }

    public void testGetLastName() {
        Double [] exams = {100.0, 95.0};
        Student student = new Student("John", "Morris", exams);
        String expected = "Morris";
        String actual = student.getLastName();
        Assert.assertEquals(expected, actual);
    }

    public void testGetNumberOfExamsTaken() {
        Double [] exams = {100.0, 95.0};
        Student student = new Student("John", "Morris", exams);
        int expected = 2;
        int actual = student.getNumberOfExamsTaken();
        Assert.assertEquals(expected, actual);
    }

    public void testSetFirstName() {
        Double [] exams = {100.0, 95.0};
        Student student = new Student("John", "Morris", exams);
        String expected = "Prahtihba";
        student.setFirstName(expected);
        String actual = student.getFirstName();
        Assert.assertEquals(expected, actual);
    }

    public void testSetLastName() {
        Double [] exams = {100.0, 95.0};
        Student student = new Student("John", "Morris", exams);
        String expected = "Prahtihba";
        student.setLastName(expected);
        String actual = student.getLastName();
        Assert.assertEquals(expected, actual);
    }

    public void testGetExamScores() {
        Double [] exams = {100.0, 95.0, 123.0, 96.0 };
        Student student = new Student("John", "Morris", exams);
        String expected = "Exam Scores:\n"+
        "Exam 1 -> 100.0\n"+
        "Exam 2 -> 95.0\n"+
        "Exam 3 -> 123.0\n"+
        "Exam 4 -> 96.0\n";
        //student.getExamScores();
        String actual = student.getExamScores();
        Assert.assertEquals(expected, actual);
    }

    public void testAddExamScore() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { };
        Student student = new Student(firstName, lastName, examScores);
        String expected = "Exam Scores:\n"+
                "Exam 1 -> 100.0\n";
// When
        student.addExamScore(100.0);
        String output = student.getExamScores();

// Then
        Assert.assertEquals(expected, output);
    }

    public void testSetExamScore() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0 };
        Student student = new Student(firstName, lastName, examScores);
        String expected = "Exam Scores:\n"+
                "Exam 1 -> 150.0\n";
// When
        student.setExamScore(1, 150.0);
        String output = student.getExamScores();

// Then
        Assert.assertEquals(expected, output);
    }

    public void testGetAverageExamScore() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);
        Double expected =125.0;
        // When
        Double output = student.getAverageExamScore();

        // Then
        Assert.assertEquals(expected, output);
    }

    public void testTestToString() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);
        String expected = "Exam Scores:\n"+
                "Exam 1 -> 100.0\n"+
                "Exam 2 -> 150.0\n"+
                "Exam 3 -> 250.0\n"+
                "Exam 4 -> 0.0\n";
        // When
        String output = student.toString();

        // Then
        Assert.assertEquals(expected, output);

    }
}