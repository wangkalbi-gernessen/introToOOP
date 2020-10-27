package lab3;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        // 1.Create an ArrayList<Piece> to include all types of pieces.
        ArrayList<Piece> pieces = new ArrayList<Piece>();
        pieces.add(new Bishop());
        pieces.add(new King());
        pieces.add(new Knight());
        pieces.add(new Pawn());
        pieces.add(new Queen());
        pieces.add(new Rook());

        // 2.Using for-each loop, call move() method on each Piece to print the moves.
        for(Piece elem : pieces){
            System.out.print(elem + ": ");
            elem.move();
        }
//        King k1 = new King(1, true);
//        King k2 = new King();
//        System.out.println(k1.equals(k2));

        // 3.Create the following Pawns.
        Piece p1 = new Pawn(1, true, true, new Queen());
        Piece p2 = new Pawn(1, true, false, null);
        Piece p3 = new Pawn(1, false, false, null);
        Piece p4 = new Pawn(1, false, true, new Queen());
        Piece p5 = new Pawn(1, true, true, new Knight());

        // 4.Use equals() method to compare the following
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p4));
        System.out.println(p1.equals(p5));
        System.out.println(p2.equals(p3));
        System.out.println(p4.equals(p5));
    }
}