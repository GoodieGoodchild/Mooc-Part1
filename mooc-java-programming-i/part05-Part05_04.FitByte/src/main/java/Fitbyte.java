/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonat
 */
public class Fitbyte {


    private int age;
    private int restingHeartRate;
    
    
    public Fitbyte(int age, int rHRate) {
        this.age = age;
        this.restingHeartRate = rHRate;
    }
    
    public double targetHeartRate(double percentageofMaximum) {
        //(maximum heart rate - resting heart rate) * (target heart rate percentage) 
        double tHR = ((maxHeartRate() - (restingHeartRate * 1.0)) * percentageofMaximum) + (restingHeartRate * 1.0);
        return tHR;
    }
    
    public double maxHeartRate() {
        return 206.3 - (0.711 * this.age);
    }
    
    
}
