
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonat
 */
public class Statistics {
    
    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;
        
    public Statistics() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
        
    }

    public void addGradeBasedOnPoints(int points) {
        if (0 < points && points < 100) {
            this.grades.add(pointsToGrade(points));
            this.points.add(points);
        }
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }
        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
    public double averageOfGrades() {
        int totalGrades = 0;
        while (!(grades.isEmpty())) {
            for (int i = 0; i < grades.size(); i++) {
                totalGrades = totalGrades + grades.get(i);
            }
            return totalGrades*1.0/grades.size()*1.0;
        }
        return -1;
    }
    
    public double averageOfPoints() {
        int totalPoints = 0;
        while (!(points.isEmpty())) {
            for (int i = 0; i < points.size(); i++) {
                totalPoints = totalPoints + points.get(i);
            }
            
            return totalPoints*1.0/points.size()*1.0;
            }
        return -1;
    }
    
    public double averagePassing() {
        ArrayList<Integer> passMarks = new ArrayList<>();
        int totalScores = 0;
        for (int i = 0; i < points.size(); i++) {
            if (50 <= this.points.get(i)) {
                passMarks.add(points.get(i));
                totalScores = totalScores + points.get(i);
            }
        }
        return totalScores*1.0/passMarks.size()*1.0;
    }
    
    public double passPercentage() {
        int peoplePassing = 0;
        for (int i = 0; i < points.size(); i++) {
            if (50 <= this.points.get(i)) {
                peoplePassing ++;
            }
        }
        return 100 * peoplePassing*1.0/points.size()*1.0;
    }
    
    
}
