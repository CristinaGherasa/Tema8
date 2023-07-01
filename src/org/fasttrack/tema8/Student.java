package org.fasttrack.tema8;

public class Student {
    private String name;
    private int grade;
    private static int totalGrades = 0;
    private static int numStudents = 0;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        totalGrades += grade;
        numStudents++;
    }

    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }

    public static double getAverageGrade() {
        if (numStudents == 0) {
            return 0.0;
        } else {
            return (double) totalGrades / numStudents;
        }
    }
}
