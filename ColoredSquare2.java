package r08;

public class ColoredSquare implements Square {
    private final int side;
    private final String color;
    
    public ColoredSquare(int side, String color) {
        this.side = side;
        this.color = color;
    }
    
    @Override
    public int getArea(){
        return side*side;
    }
    
    @Override
    public int getLength(){
        return side;
    }
    
    public String getColor(){
        return color;
    }
    
    @Override
    public boolean equals(Object other){
        if(other instanceof ColoredSquare){
            that = (ColoredSquare) other;
            return side==that.getLength() && color==that.getColor();
        } else if(other instanceof Square){
            that = (Square) other;
            return side==that.getLength();
        } else {
            return false;
        }
    }
}