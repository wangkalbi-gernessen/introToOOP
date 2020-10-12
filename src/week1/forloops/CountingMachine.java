package week1.forloops;
import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Count to:");
        int num = obj.nextInt();
        for(int i = 0; i <= num; i++){
            System.out.print(i + " ");
        }
    }
}
