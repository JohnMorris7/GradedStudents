package io.zipcoder;

import java.util.ArrayList;

public class Student {

    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;
    public Student(String firstName, String lastName, ArrayList<Double> testScores) {
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
            return examScores.size();
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        public String getExamScores() {
            String output = "Exam Scores:" + "\n";
            System.out.println("Exam Scores:" + "\n");
            for (int i = 0; i < examScores.size(); i++) {
                output += "Exam " + (i + 1) + " -> " + examScores.get(i);
                System.out.println("Exam " + (i + 1) + " -> " + examScores.get(i));
            }
            return output;
        }

        public void addExamScore(double examScore) {
            examScores.add(examScore);
        }

        public void setExamScore(int examNumber, double newScore) {
            examScores.set(examNumber - 1, newScore);
        }
        public double getAverageExamScore() {
            Double total = 0.0;
            for (int i = 0; i < examScores.size(); i++) {
                total += examScores.get(i);
            }
            Double average = total / (examScores.size() - 1);
            return average;
        }

        @Override
        public String toString() {
            return "Student Name:  " + firstName + " "  + lastName  +
                    "\n > Average Score: " + getAverageExamScore()
                    +"\n >" + getExamScores();
        }
    }


