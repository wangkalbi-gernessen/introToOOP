package week1.whileloops;
import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {
        int sum = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("I will add up the numbers you give me");
        System.out.println("Number:");
        int num = obj.nextInt();
        while(num != 0){
            sum += num;
            System.out.println("The total so far is " + sum);
            System.out.println("Number:");
            num = obj.nextInt();
        }
        System.out.println("The total is " + sum);
    }
}
