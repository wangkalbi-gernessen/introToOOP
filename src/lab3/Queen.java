package lab3;

public class Queen extends Piece {
    public static final int QUEEN_VALUE = 9;

    public Queen(){
        this(QUEEN_VALUE, true);
    }

    public Queen(int value, boolean isWhite){
        super(value, isWhite);
    }

    @Override
    public String toString(){
        return "Queen{value=’" + getValue() + '\'' + '}';
    }

    @Override
    public void move() {
        System.out.println("Like bishop and rook");
    }
}
