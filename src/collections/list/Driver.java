package collections.list;


import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {
//        MyLinkedList<String> ll = new MyLinkedList<>();
//        ll.addFirst("Hello");
//        ll.addFirst("Bye");
//        ll.addFirst("Hello");
//        ll.addFirst("Hola");
//        ll.add(2,"Hallo");
//        System.out.println(ll.remove("Hola"));
//        System.out.println(ll.lastIndexOf("H  ello"));
//        ll.reverse();
//        System.out.println(ll);

        MyArrayList num = new MyArrayList(5);
        ArrayList<String> c = new ArrayList<>();
        c.add("England");
        c.add("Germany");
        c.add("France");
        c.add("Italy");
        c.add("Spain");
        MyArrayList num1 = new MyArrayList(c);

        ArrayList<String> d = new ArrayList<>();
        d.add("Belgium");
        d.add("Japan");
        d.add("Singapore");


//        System.out.println(num1.remove("England"));
        System.out.println(num1.addAll(d));
    }
}