package lab3;

/**
 * @author Kazunobu Someya
 */
public abstract class Piece {
    private int value;
    private boolean isWhite;

    public Piece(int value, boolean isWhite){
        setValue(value);
        setWhite(isWhite);
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean getWhite(){
        return this.isWhite;
    }

    public void setWhite(boolean isWhite){
        this.isWhite = isWhite;
    }

    public abstract void move();

    @Override
    public String toString(){
        return "Piece{value=’" + value + '\'' + '}';
    }

    // Thanks to Takayuki's clue I could come up with following code
    // I referred to following URL
    // https://www.geeksforgeeks.org/overriding-equals-method-in-java/
    @Override
    public boolean equals(Object b){
        if(b == null){
            return false;
        }
        if(b == this) {
            return true;
        }
        if(!(b instanceof Piece)){
            return false;
        }
        Piece p = (Piece)b;
        if((p.value == this.value) && (p.isWhite == this.isWhite)){
            return true;
        }else{
            return false;
        }
    }
}
