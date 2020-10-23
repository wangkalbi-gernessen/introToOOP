package week2.arrays;
import java.util.*;

/**
 * @author Kazunobu Someya
 */
public class FindingTheLargestValue {
    public static void main(String[] args) {
        int[] a = new int[10];
        System.out.print("Array:");
        for (int i = 0; i <= a.length - 1; i++) {
            Random rand = new Random();
            int num = rand.nextInt(100);
            a[i] = num;
            System.out.print(a[i] + " ");
        }

        // I referred to following URL regarding how to output max value of arrays without using Math.max()
        // https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
        int smallest = a[0];
        int largest = a[0];
        for (int j = 1; j <= a.length - 1; j++) {
            if (a[j] > largest) {
                largest = a[j];
            }
            if (a[j] < smallest) {
                smallest = a[j];
            }
        }
        System.out.println("\n");
        System.out.println("The largest value is " + largest);
    }
}