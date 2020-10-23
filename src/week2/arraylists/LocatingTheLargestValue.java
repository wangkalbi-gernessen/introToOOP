package week2.arraylists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Kazunobu Someya
 */
public class LocatingTheLargestValue {
    public static void main(String[] args) {
        int[] a = new int[10];
        ArrayList<Integer> array = new ArrayList<Integer>(a.length);
        for (int i = 0; i <= a.length - 1; i++) {
            Random rand = new Random();
            int num = rand.nextInt(100);
            num += 1;
            array.add(num);
        }
        System.out.println("ArrayList:" + array);

        int smallest = array.get(0);
        int largest = array.get(0);
        for(int j = 0; j <= array.size() - 1; j++) {
            if (array.get(j) < smallest) {
                smallest = array.get(j);
            }
            if (array.get(j) > largest) {
                largest = array.get(j);
            }
        }
        int index = array.indexOf(largest);
        System.out.println("The largest value is " + largest + ",which is in slot " + index);
    }
}