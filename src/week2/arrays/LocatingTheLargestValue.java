package week2.arrays;

import java.util.*;

/**
 * @author Kazunobu Someya
 */
public class LocatingTheLargestValue {
    public static void main(String[] args) {
        int[] length = new int[10];
        System.out.print("Array:");
        for (int i = 0; i <= length.length - 1; i++) {
            Random rand = new Random();
            int num = rand.nextInt(100);
            num += 1;
            length[i] = num;
            System.out.print(num + " ");;
        }

        int largest = length[0];
        int smallest = length[0];
        for (int j = 1; j <= length.length - 1; j++) {
            if (length[j] > largest) {
                largest = length[j];

            }
            if (length[j] < smallest) {
                smallest = length[j];
            }
        }
        System.out.println("\n");
        System.out.println("The largest value is " + largest);
        System.out.println("It is in slot " + searchIndex(length, largest));

    }

    /**
     * Make this method to search for index of largest value
     * @param length
     * @param largest
     * @return
     */
    public static int searchIndex(int[] length, int largest) {
        int index = 0;
        for(int k = 0; k <= length.length - 1; k++) {
            if (largest == length[k]) {
                index = k;
            }
        }
        return index;
    }
}