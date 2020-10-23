package week2.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Kazunobu Someya
 */
public class CopyingArrays {
    public static void main(String[] args) {
        int[] a = new int[10];
        System.out.print("Array1:");
        for (int i = 0; i <= a.length - 1; i++) {
            Random rand = new Random();
            int num = rand.nextInt(100);
            num += 1;
            a[i] = num;
            if (i == a.length - 1) {
                a[i] = -7;
            }
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        System.out.print("Array2:");
        int[] b = a.clone();
        for (int i = 0; i <= b.length - 1; i++) {
            Random rand = new Random();
            int num = rand.nextInt(100);
            num += 1;
            if (i == b.length - 1) {
                b[i] = num;
            }
            System.out.print(b[i] + " ");
        }
    }
}