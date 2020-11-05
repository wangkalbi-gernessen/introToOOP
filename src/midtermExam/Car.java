package midtermExam;

/**
 * @author Kazunobu Someya
 */
public class Car extends Vehicle{
    private boolean isLeftHandDriving;

    public Car(String productId, int weight, boolean isLeftHandDriving){
        super(productId, weight);

    }

    public boolean isLeftHandDriving(){
        return this.isLeftHandDriving;
    }

    public void setLeftHandDriving(boolean isLeftHandDriving){
        this.isLeftHandDriving = isLeftHandDriving;
    }


    @Override
    public void accelerate() {
        if(getWeight() == 0){
            System.out.println("there's something wrong");
        }else{
            System.out.println("fire pistons, turn wheels");
        }
    }

    @Override
    public void steerLeft() {
        System.out.println("turn wheels left");
    }

    @Override
    public void steerRight() {
        System.out.println("turn wheels right");
    }

    @Override
    public String toString(){
        return "Car{productId='" + getProductId() + "', weight=" + getWeight() + ", isLeftHandDriving=" + isLeftHandDriving() + "}";
    }
}
