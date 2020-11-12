package myPractice.basics;

import java.util.*;

/**
 * @author Kazunobu Someya
 */
public class MyApp {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Please enter your name: ");
//        String name = in.nextLine();
//        System.out.println(name);
        System.out.println(removeDuplicates("abbaca"));

    }

    public static String removeDuplicates(String S) {
        Stack<Character> stk = new Stack<Character>();
        for(char ch : S.toCharArray()){
            if(stk.isEmpty()){
                stk.push(ch);
            }else if(ch != stk.peek()){
                stk.push(ch);
            }else{
                stk.pop();
            }
        }
        String word = "";
        while(0 < stk.size()){
            word += stk.pop();
        }
        return word;
    }
}