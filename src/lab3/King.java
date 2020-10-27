package lab3;

public class King extends Piece {
    public static final int KING_VALUE = 1_000;

    public King(){
        this(KING_VALUE, true);
    }

    public King(int value, boolean isWhite){
        super(value, isWhite);
    }

    @Override
    public String toString(){
        return "King{value=’" + getValue() + '\'' + '}';
    }

    @Override
    public void move() {
        System.out.println("One square");
    }
}
