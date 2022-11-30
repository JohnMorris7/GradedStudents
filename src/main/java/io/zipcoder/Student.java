package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private String firstName;
    private String lastName;

    public void setExamScores(Double[] examScores) {
        this.examScores = examScores;
    }

    private Double[] examScores;
    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = testScores;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getNumberOfExamsTaken() {
            return examScores.length;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        public String getExamScores() {
            String output = "Exam Scores:\n";
            //System.out.println("Exam Scores:" + "\n");
            for (int i = 0; i < examScores.length; i++) {
                output += ("Exam " + (i + 1) + " -> " + examScores[i]+"\n");
               // System.out.println("Exam " + (i + 1) + " -> " + examScores[i]);
            }
            return output;
        }

        public void addExamScore(double examScore) {
           ArrayList<Double> arrayList = new ArrayList<>(Arrays.asList(examScores));
           arrayList.add(examScore);
           examScores = arrayList.toArray(examScores);
        }

        public void setExamScore(int examNumber, double newScore) {
            examScores[examNumber - 1] = newScore;
        }
        public double getAverageExamScore() {
            double total = 0.0;
            double size = this.examScores.length;
            for (int i = 0; i < size; i++) {
                total += this.examScores[i];
            }
            return total / size;
        }

        @Override
        public String toString() {
            //"Student Name:  " + firstName + " "  + lastName  +
                   // "\n > Average Score: " + getAverageExamScore()
            return getExamScores();
        }
    }


