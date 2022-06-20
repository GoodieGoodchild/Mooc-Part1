import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonat
 */
public class UserInterface {
    
    //private Statistics statistics;
    private Statistics statistics;
    private Scanner scanner;
    
    
    public UserInterface(Statistics statistics, Scanner scanner) {
        this.statistics = statistics;
        this.scanner = scanner;
    }
    
    public void start() {
        readPoints(); 
        System.out.println("Point average (all): " + statistics.averageOfPoints());
        System.out.println("Point average (passing): " + statistics.averagePassing());
        System.out.println("Pass percentage: " + statistics.passPercentage());
        printGradeDistribution();
    }

    public void readPoints() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                break;
            }
            
            this.statistics.addGradeBasedOnPoints(input);
        }
    }
    
    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = statistics.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade = grade - 1;
    }
        
    }
        
    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}