package midtermExam;

import java.util.ArrayList;

/**
 * @author Kazunobu Someya
 */
public class Driver {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("c1", 250, true));
        vehicles.add(new Car("c2", 220, true));
        vehicles.add(new Car("c3", -210, false));
        vehicles.add(new Boat("b1", 500));
        vehicles.add(new Boat("b2", 700));
        vehicles.add(new Boat("b3", 800));

        for(Vehicle elem : vehicles){
            System.out.println(elem);;
        }

        for(Vehicle elem : vehicles){
            elem.accelerate();
        }
    }
}
