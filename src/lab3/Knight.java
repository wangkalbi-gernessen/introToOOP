package lab3;

public class Knight extends Piece{
    public static final int KNIGHT_VALUE = 2;

    public Knight(){
        this(KNIGHT_VALUE, true);
    }

    public Knight(int value, boolean isWhite){
        super(value, isWhite);
    }

    @Override
    public String toString(){
        return "Knight{value=’" + getValue() + '\'' + '}';
    }

    @Override
    public void move() {
        System.out.println("Like an L");
    }
}
