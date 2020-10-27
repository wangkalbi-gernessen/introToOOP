package lab3;

public class Rook extends Piece {
    public static final int ROOK_VALUE = 5;

    public Rook(){
        this(ROOK_VALUE, true);
    }

    public Rook(int value, boolean isWhite){
        super(value, isWhite);
    }

    @Override
    public String toString(){
        return "Rook{value=’" + getValue() + '\'' + '}';
    }

    @Override
    public void move() {
        System.out.println("Horizontally or vertically");
    }
}
