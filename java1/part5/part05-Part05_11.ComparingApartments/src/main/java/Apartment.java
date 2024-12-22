
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public int getSquares() {
        return squares;
    }

    public int getPrincePerSquare() {
        return princePerSquare;
    }

    public boolean largerThan(Apartment compared){
        return this.squares > compared.getSquares();
    }
    
    public int priceDifference(Apartment compared){
        int priceDifference = (this.princePerSquare * this.squares) - (compared.getPrincePerSquare() * compared.getSquares());
        if(priceDifference < 0) {
            return priceDifference * -1;
        }
        return priceDifference;
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        int ownPrice = this.princePerSquare * this.squares;
        int comparedPrice = compared.getPrincePerSquare() * compared.getSquares();
        return ownPrice > comparedPrice;
    }
}
