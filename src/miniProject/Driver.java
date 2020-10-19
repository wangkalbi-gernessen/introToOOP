package miniProject;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;

public class Driver {
    public static <Char> void main(String[] args) {
        Game g1 = new Game();

        try {
            File obj = new File("cities.txt");
            Scanner in = new Scanner(obj);
            System.out.println("Here's the question.");
            System.out.println("________");
            System.out.print("Guess a letter: ");
            char a = in.next().charAt(0);
            System.out.println(a);
            System.out.println("You are guessing: ");
            System.out.println("You have guessed (0) wrong letters:");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
