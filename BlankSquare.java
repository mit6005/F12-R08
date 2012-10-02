package r08;

public class BlankSquare implements Square {
    private final int side;
    
    public BlankSquare(int side) {
        this.side = side;
    }
    
    @Override
    public int getArea(){
        return side*side;
    }
    
    @Override
    public int getLength(){
        return side;
    }

    @Override
    public boolean equals(Object other){
        if(other instanceof Square){
            that = (Square) other;
            return side==that.getLength();
        } else {
            return false;
        }
    }

}