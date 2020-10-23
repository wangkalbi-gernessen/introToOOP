package week2.arrays;

import java.util.*;

/**
 * @author Kazunobu Someya
 */
public class WhereIsIt {
    public static void main(String[] args) {
        int[] length = new int[10];
        System.out.print("Array:");
        for (int i = 0; i <= length.length - 1; i++) {
            Random rand = new Random();
            int num = rand.nextInt(50);
            num += 1;
            length[i] = num;
            System.out.print(num + " ");
        }

        System.out.println("");
        Scanner obj = new Scanner(System.in);
        System.out.print("Value to find:");
        int input = obj.nextInt();
        System.out.println(researchInputValue(length, input));

    }

    /**
     * Meke this method to search for input value
     * @param length
     * @param input
     * @return
     */
    public static String researchInputValue(int[] length, int input) {
        for (int i = length.length - 1; i >= 0; i--) {
            if (input == length[i]) {
                return input + " is is slot " + i + ".";
            }
        }
        return input + " is not in the array.";
    }
}