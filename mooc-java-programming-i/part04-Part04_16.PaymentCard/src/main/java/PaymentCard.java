/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonat
 */
public class PaymentCard {
    
    private double balance;
    
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }
    
    public String toString() {
        // write code here
        return "The card has a balance of " + this.balance + " euros";
    }
   
//    The method eatAffordably should reduce the card's balance by € 2.60, 
//    and the method eatHeartily should reduce the card's balance by € 4.60.
    
    public void eatAffordably() {
        if (this.balance >= 2.6) {
            this.balance -= 2.60;
        }
    }
    
    public void eatHeartily() {
        if (this.balance >= 4.6) {
            this.balance -= 4.60;
        }
    }
    
    public void addMoney(double money) {
        if (this.balance + money >= 150) {
            this.balance = 150;
        } else if (money > 0) {
            this.balance += money;
        }
    }
}
