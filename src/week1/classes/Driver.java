package week1.classes;

public class Driver {
    public static void main(String[] args) {
        // Make instance
        Rectangle r1 = new Rectangle(5, 7, "Blue");
        Rectangle r2 = new Rectangle(10, 2, "Green");
        Rectangle r3 = new Rectangle(15, 12, "Red");

        // Call draw function
        r1.draw(r1.getWidth(), r1.getHeight(), r1.getColor());
        r2.draw(r2.getWidth(), r2.getHeight(), r2.getColor());
        r3.draw(r3.getWidth(), r3.getHeight(), r3.getColor());
    }
}
