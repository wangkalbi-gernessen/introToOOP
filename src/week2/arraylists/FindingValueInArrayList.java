package week2.arraylists;
import java.util.*;

/**
 * @author Kazunoby Someya
 */
public class FindingValueInArrayList {
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

        Scanner obj = new Scanner(System.in);
        System.out.print("Value to find:");
        int number = obj.nextInt();
        System.out.println(searchInputValue(array, number));


    }

    /**
     * Make this method to search for input value
     * @param array
     * @param number
     * @return
     */
    public static String searchInputValue(ArrayList<Integer> array, int number) {
        String str = "";
        for(int i = 0; i <= array.size() - 1; i++) {
            if (number == array.get(i)) {
                str += number + " is in the ArrayList.\n";
            }
        }
        return str;
    }
}