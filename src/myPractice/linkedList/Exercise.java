package myPractice.linkedList;
import java.util.*;

public class Exercise {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        // Add values in the linked list
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        list.add("Yellow");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        ArrayList<Integer> head = new ArrayList<>();
        head.add(1);
        head.add(0);
        head.add(1);
        LinkedList<Integer> arr = new LinkedList<Integer>(head);
        int sum = 0;
        for(int i = arr.size() - 1; i >= 0; i--){
            sum += arr.get(i) * Math.pow(2, i);
        }
        System.out.println(sum);

    }
}
