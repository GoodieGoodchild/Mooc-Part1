
import jdk.nashorn.internal.ir.Terminal;


public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000.0;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        
        
        // ComparisonFailure: When buying an affordable meal from an empty terminal using a card, the money in the payment 
        // terminal should remain unchanged and the amount of affordable meals sold should be 1.
        // expected:<money: [1000.0], number of sold aff...> but was:<money: [997.5], number of sold aff...>
        if (payment >= 2.5 && getMoney() > -2.5) {
            this.money += 2.5;
            affordableMeals +=1;
            return payment - 2.5;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment >= 4.3  && getMoney() > -4.3) {
            this.money += 4.3;
            heartyMeals += 1;
            return payment - 4.3;
        }
        return payment;
    }


    @Override
    public String toString() {
        return "money: " + this.money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
    
    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        double aM = 2.5;
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        if (card.balance() >= aM) {
            card.takeMoney(aM);
            affordableMeals +=1;
            //this.money = this.money + aM;
            return true;
        }
        // otherwise false is returned
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        double hM = 4.3;
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if (card.balance() >= hM) {
            card.takeMoney(hM);
            heartyMeals += 1;
            //this.money = this.money + hM;
            return true;
        }
        return false;
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        // ...
        if (sum > 0) {
            this.money += sum;
            card.addMoney(sum);
        }
        
    }
    
    public double getMoney() {
        return this.money;
    }
    
}
