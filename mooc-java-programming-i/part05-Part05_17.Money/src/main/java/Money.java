
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros+addition.euros,this.cents+addition.cents);
        //if the cent value added is greater than a hundred, 
        //recalculate cent value
        //add one to euro value
        if (addition.cents() + this.cents > 99) {
            newMoney = new Money((this.euros+1+addition.euros),(this.cents+addition.cents-100));
            return newMoney;
        }
        
        return newMoney;
    }
    //if a is less  than 
    public boolean lessThan(Money compared) {
        double myCash = this.euros*1.0+this.cents*0.01;
        double compCash = compared.euros()*1.0+compared.cents()*0.01;
        if (compCash - myCash > 0) {
            return true;
        }
        return false;
    }
    
    public Money minus(Money decreaser) {
        Money myMoney = new Money(this.euros, this.cents);
        
        if (decreaser.lessThan(myMoney)) {
            if (this.cents - decreaser.cents < 0) {
                myMoney = new Money(this.euros - decreaser.euros - 1, (this.cents - decreaser.cents + 100));
                return myMoney;
            } else if (this.cents==0 && decreaser.cents ==0) {
                myMoney = new Money(this.euros - decreaser.euros, 0);
            } else if (this.euros == decreaser.euros && decreaser.cents < this.cents) {
                myMoney = new Money(this.euros-decreaser.euros,this.cents-decreaser.cents);
            }
        } else {
            myMoney = new Money(0,0);
        }
        return myMoney;
    }
    
    //3.40-2.80 = 0.60
}
