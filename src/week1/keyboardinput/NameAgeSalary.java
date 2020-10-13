package week1.keyboardinput;
import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
//        try {
//            Scanner obj = new Scanner(System.in);
//            System.out.println("Hello. What is your name?");
//            String name = obj.nextLine();
//            System.out.println("Hi," + name + "! How old are you?");
//            int age = obj.nextInt();
//            System.out.println("So you're " + age + ",eh? That's not old at all!\nHow much do you make," + name + "?");
//            double salary = obj.nextDouble();
//            System.out.println(salary + "! I hope that's per hour and not per year!LOL!");
//        } catch (Exception e) {
//            System.out.println("It's wrong");
//        }
        Scanner obj = new Scanner(System.in);
        try {
            System.out.println("Hello. What is your name?");
            String name = obj.nextLine();
            System.out.println("Hi," + name + "! How old are you?");
        } catch (Exception e) {
            System.out.println("Input String");
        }
    }
}
