package week2.arrays;
import java.util.Random;

public class BasicArrays2 {
    public static void main(String[] args) {
        int[] length = new int[10];
        for (int i = 0; i <= length.length - 1; i++) {
            Random rand = new Random();
            int num = rand.nextInt(100);
            num += 1;
            System.out.println("Slot " + i + " contains a " + num);
        }
    }
}
