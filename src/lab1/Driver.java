package lab1;

/**
 * @author Kazunobu Someya
 */
public class Driver {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Model obj1 = new Model();
        Model obj2 = new Model("Susan", "Smith", 70, 120, false, true);
        Model obj3 = new Model("Tiger", "Woods", 72,190);
        obj2.printDetails();
        System.out.println("");
        obj3.printDetails();
        System.out.println("");
        // Thanks to Danilo
        obj2.setHeight(5, 10);
//        obj2.setWeight(345L);
        obj2.setCanTravel(true);
        obj2.setSmokes(false);
        obj2.displayModelDetails();
    }
}
