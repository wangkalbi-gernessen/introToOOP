package basics;

public class DoubleIntDivision {
    public static void main(String[] args) {

        double x = 10;
        int y = 3;
        int z = 7;

        int a = z / y;
        System.out.println(a); // 2
        double b = x / y;
        System.out.println(b); // 3.33333
        // double / int -> double
        // int / double -> double
        // int / int -> int

        //'casting' -> force to change the type
        int c = (int)x / y; // cast x to int
        int d = (int)(x / y); // cast the result of division
        System.out.println(c); // 3
        System.out.println(d);  // 3

        double e = (double) (z / y); // 7 / 3 = 2.0
        System.out.println(e);
    }
}
