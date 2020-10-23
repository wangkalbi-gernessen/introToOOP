package week2.arraylists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GettingTheLargestValue {
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

        // I referred to following URL regarding how to output max value of arrays without using Math.max()
        // https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
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
        System.out.println("The largest value is " + largest);
    }
}
