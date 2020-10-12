package week1.keyboardinput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Hello. What is your name?");
        String name = obj.nextLine();
        System.out.println("Hi," + name + "! How old are you?");
        int age = obj.nextInt();
        System.out.println("Did you know that in five years you will be " + (age + 5) + " years old?\n" +
                "And five years ago you were " + (age - 5) + "! Imagine that!");
    }
}
