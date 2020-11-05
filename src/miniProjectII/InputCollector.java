package miniProjectII;

import java.util.*;
import java.util.regex.Pattern;

/**
 * @author Kazunobu Someya
 */
public class InputCollector {

    public static String getUserInput(String prompt){
        Scanner obj = new Scanner(System.in);
        System.out.println(prompt);
        String optionNum = obj.nextLine();
        return optionNum;
    }

    public static String getUsername(String name){
        Scanner obj = new Scanner(System.in);
        System.out.println(name);
        String username = obj.nextLine();
        return username;
    }

    public static String getMobileNumber(String mobile) {
        Scanner obj = new Scanner(System.in);
        System.out.println(mobile);
        String mobileNum = obj.nextLine();
        return mobileNum;
    }

    public static void removeContact(){

    }

    public static void updateContact(){

    }

}
