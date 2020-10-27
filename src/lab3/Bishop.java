package lab3;

public class Bishop extends Piece {
    // static final field
    public static final int PAWN_VALUE = 1;

    public Bishop(){
        this(PAWN_VALUE, false);
    }

    public Bishop(int value, boolean isWhite){
        super(value, isWhite);
    }

    @Override
    public String toString(){
        return "Bishop{value=’" + getValue() + '\'' + '}';
    }

    @Override
    public void move() {
        System.out.println("Diagonally");
    }
}
