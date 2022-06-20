
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if (getSquares() > compared.getSquares()) {
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        if ((getPricePSQ()*getSquares()) - (compared.getPricePSQ()*compared.getSquares()) < 0) {
            return ((getPricePSQ()*getSquares()) - (compared.getPricePSQ()*compared.getSquares())) * -1;
        }
        return (getPricePSQ()*getSquares()) - (compared.getPricePSQ()*compared.getSquares());
    }
    
    public boolean moreExpensiveThan(Apartment verrattava) {
        
         if ((getPricePSQ()*getSquares()) - (verrattava.getPricePSQ()*verrattava.getSquares()) < 0) {
            return false;
        }
        return true;
    }
    
    public int getPricePSQ() {
        return this.princePerSquare;
    }
    
    public int getSquares() {
        return this.squares;
    }

}
