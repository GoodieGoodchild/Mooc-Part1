/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonat
 */
public class Container {

    private int volume;

    public Container() {
        this.volume = 0;
    }

    public int contains() {
        return this.volume;
    }

    public void add(int amount) {

        if (amount < 0) {
        } else if (this.volume + amount > 100) {
            this.volume = 100;
        } else {
            this.volume += amount;
        }

    }

    public void remove(int amount) {
        if (this.volume <= 0) {
            //do nothing
        } else if (this.volume - amount <= 0) {
            this.volume = 0;
        } else if (this.volume - amount >= 0) {
            this.volume -= amount;
        }

    }

    public String toString() {
        return "" + this.volume + "/100";
    }

}
