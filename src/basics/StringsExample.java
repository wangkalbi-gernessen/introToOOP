package basics;

// Memory
// - Heap
// - stack
// - Data
// - Code

public class StringsExample {
    public static void main(String[] args) {
        // 1. string literal
        String name = "Derrick"; // data segment (read only)
        String name1 = new String("Derrick"); // memory address is different
        String name2 = "Derrick";

        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);

        // comparing memory address
        System.out.println(name == name2); // true
        System.out.println(name1 == name2); // false why?

        // comparing strings the right way
        System.out.println(name1.equals(name2));

        // length (the number of characters);
        System.out.println(name.length()); // parenthesis is necessary after length

        // substring
        String cafe = "Starbucks"; // second cup, blenz tim hortons
        System.out.println(cafe.substring(0, 4)); // star
        System.out.println(cafe.indexOf("bucks")); // 4

        // Exercise
        // print every char in a String
        String brand = "Panasonic";
//        for(int i = 0; i <= brand.length() - 1; i++){
//            System.out.println(i);
//        }
        for(int i = 0; i <= brand.length() - 1; i++){
            System.out.println(brand.substring(i, i+ 1));
//            System.out.println(brand.charAt(i));
        }

        // "sony" -> {"s", "o", "n", "y"}
        for(char ch : brand.toCharArray()){
            System.out.println(ch);
        }
    }
}
