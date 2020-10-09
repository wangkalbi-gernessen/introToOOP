package basics;

import java.util.Scanner; // Import scanner class. Scanner class is necessary for input function

public class IOExample {
    public static void main(String[] args) {
        // Write a program to say "I love you" in each language
        // "en" - English
        // "pt-br" Portuguese (Brazil)
        // "es" - Spanish
        // "jp" - Japanese
        // "kr" - Korean

        // 1. create a scanner object
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Enter the language code ('q' to quit): ");
            String countryCode = in.nextLine();
            switch(countryCode) {
                case "en":
                    System.out.println("I love you");
                    break;
                case "pt-br":
                    System.out.println("Eu Amo Voce");
                    break;
                case "es":
                    System.out.println("Te Amo");
                    break;
                case "jp":
                    System.out.println("Aishiteru");
                    break;
                case "kr":
                    System.out.println("Saranhaeyo");
                    break;
                case "q":
                    System.exit(0); // terminate the program
                default:
                    System.out.println("Country code Not Supported");
                    break;
            }
        }
    }
}
