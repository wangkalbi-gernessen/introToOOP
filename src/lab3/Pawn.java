package lab3;

public class Pawn extends Piece{
    private boolean promoted;
    private Piece newPiece;

    public static final int PAWN_VALUE = 1;

    public Pawn(){
        this(PAWN_VALUE, true, false, null);
    }

    public Pawn(int value, boolean isWhite, boolean promoted, Piece newPiece){
        super(value, isWhite);
        this.promoted = promoted;
        this.newPiece = newPiece;
    }


    public void promote(Piece newPiece){
        Pawn b = new Pawn();
    }

    // I referred following URL
    // https://www.infoworld.com/article/3305792/comparing-java-objects-with-equals-and-hashcode.html#:~:text=Comparing%20objects%20with%20equals()&text=If%20the%20two%20objects%20have,the%20objects%20are%20not%20equal.
    @Override
    public boolean equals(Object b) {
        if(b == null || getClass() != b.getClass()){
            return false;
        }
        if(b == this) {
            return true;
        }
        if(!(b instanceof Pawn)){
            return false;
        }
        Pawn p = (Pawn)b;
        if((p.getValue() == this.getValue()) && (p.getWhite() == this.getWhite()) && (p.promoted == this.promoted) && (p.newPiece == this.newPiece)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        return "Pawn{value=’" + getValue() + '\'' + '}';
    }

    @Override
    public void move() {
        System.out.println("Forward 1");
    }
}
