package week2.arraylists;

import java.util.*;

/**
 * @author Kazunobu Someya
 */
public class WhereIsIt {
    public static void main(String[] args) {
        int[] a = new int[10];
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i <= a.length - 1; i++) {
            Random rand = new Random();
            int num = rand.nextInt(50);
            num += 1;
            array.add(num);
        }
        System.out.println(array);

        Scanner obj = new Scanner(System.in);
        System.out.print("Value to find:");
        int input = obj.nextInt();
        System.out.println(searchInputValue(array, input));
    }

    /**
     * Make a method to search for input value
     * @param array
     * @param input
     * @return
     */
    public static String searchInputValue(ArrayList<Integer> array, int input) {
        for (int j = array.size() - 1; j >= 0; j--) {
            if (input == array.get(j)) {
                return input + " is in slot " + j;
            }
        }
        return input + " is not in the ArrayList.";
    }
}
