
public class Statistics {
    
        private int count;
        private int sum;
        
    public Statistics() {
        // initialize the variable numberCount here
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        // write code here
        this.count += 1;
        this.sum += number;
    }

    public int getCount() {
        return this.count;
    }
    
    public int sum() {
        // write code here
        return this.sum;
    }

    public double average() {
        //the average method tells the average of the numbers added 
        //(the average of an empty number statistics object is 0
       if (this.sum != 0) {
        return (sum*1.0/count*1.0);
       } else {
           return 0;
       }
    }

}
