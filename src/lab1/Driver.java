package lab1;

/**
 * @author Kazunobu Someya
 */
public class Driver {
    public static void main(String[] args) {
        Model obj1 = new Model();
        Model obj2 = new Model("Susan", "Smith", 70, 120, false, true);
        Model obj3 = new Model("Tiger", "Woods", 72,190);
        obj1.printDetails();
        System.out.println("");
        obj2.printDetails();
        System.out.println("");
        obj3.printDetails();
        System.out.println("");
//        obj2.setHeight(5, 10);





//        obj2.displayModelDetails();
//        System.out.println("");
//        obj3.displayModelDetails();
    }
}
