/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonat
 */
public class Timer {
    
    private int seconds;
    private int hundredths;
    
    public Timer() {
        
        this.seconds = 0;
        this.hundredths = 0;
        
    }
    
    public String toString() {
        if (this.hundredths < 10) {
            if (this.seconds < 10){
                return "0" + this.seconds + ":0" + this.hundredths;
            }
            return this.seconds + ":0" + this.hundredths;
        }
        return this.seconds + ":" + this.hundredths;
    }
    
    public void advance() {
        this.hundredths += 1;
        
        if (this.hundredths > 99) {
            this.hundredths = 0;
            this.seconds +=1;
            if (this.seconds >59) {
                this.seconds = 0;
            }
        }
        
    }
        
    
        
    
    
}
