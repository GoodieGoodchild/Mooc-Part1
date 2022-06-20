/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonat
 */
public class Counter {
    
    private int counterValue;

    public Counter() {
        this.counterValue = 0;
    }
    
    public Counter(int startValue) {
        this.counterValue = startValue;
    }
    
    public int value() {
        return this.counterValue;
    }
    
    public void increase() {
        
            this.counterValue += 1;
        
    }
    
    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.counterValue += increaseBy;
        }
    }
    
    public void decrease() {
        
        this.counterValue -= 1;
    }
    
    public void decrease(int decreaseBy) {
        if (decreaseBy >0) {
            this.counterValue -= decreaseBy;
        }
    }
    
}
