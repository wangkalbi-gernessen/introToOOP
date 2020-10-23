package week2.arraylists;

import java.util.*;

/**
 * @author Kazunobu Someya
 */
public class BasicArrayLists2 {
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
    }
}
