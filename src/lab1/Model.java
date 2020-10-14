package lab1;
import static lab1.ModelValidation.*;

/**
 * @author Kazunobu Someya
 */
public class Model {
    // fields
    private String firstName;
    private String lastName;
    private int height;
    private double weight;
    private boolean canTravel;
    private boolean smokes;

    // constant variable
    public static final int INCHES_PER_FOOT = 12;
    public static final double POUNDS_PER_KG = 2.2046;
    public static final int BASE_RATE_DOLLARS_PER_HOUR = 60;
    public static final int TALL_INCHES = 67;
    public static final double THIN_POUNDS = 140.0;
    public static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
    public static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
    public static final int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;

    /**
     *
     */
    public Model(){

    }

    /**
     *
     * @param firstName
     * @param lastName
     * @param heightInches
     * @param weightPounds
     * @param traveler
     * @param smoker
     */
    public Model(String firstName, String lastName, int heightInches, double weightPounds, boolean traveler, boolean smoker){
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(heightInches);
        setWeight(weightPounds);
        setCanTravel(traveler);
        setSmokes(smoker);
    }

    /**
     *
     * @param firstName
     * @param lastName
     * @param heightInches
     * @param weightPounds
     */
    public Model(String firstName, String lastName, int heightInches, double weightPounds){
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(heightInches);
        setWeight(weightPounds);
        setCanTravel(true);
        setSmokes(false);
    }

    /**
     *
     * @return
     */
    public String getFirstName(){
        return this.firstName;
    }

    /**
     *
     * @param firstName
     * @throws IllegalArgumentException
     */
    public void setFirstName(String firstName) throws IllegalArgumentException{
        checkFirstName(firstName);
        this.firstName = firstName;
    }

    /**
     *
     * @return
     */
    public String getLastName(){
        return this.lastName;
    }

    /**
     *
     * @param lastName
     * @throws IllegalArgumentException
     */
    public void setLastName(String lastName) throws IllegalArgumentException{
        checkLastName(lastName);
        this.lastName = lastName;
    }

    /**
     *
     * @return
     */
    public int getHeight(){
        return this.height;
    }

    /**
     *
     * @param inches
     * @throws IllegalArgumentException
     */
    public void setHeight(int inches) throws IllegalArgumentException{
        checkHeight(inches);
        this.height = inches;
    }

    /**
     *
     * @param feet
     * @param inches
     * @throws IllegalArgumentException
     */
    public void setHeight(int feet, int inches) throws IllegalArgumentException{
        checkHeight((feet * INCHES_PER_FOOT) + inches);
        this.height = feet * INCHES_PER_FOOT + inches;
    }

    /**
     * Returns the height in feet and inches
     * @return the height in feet and inches
     */
    public String getHeightInFeetAndInches() {
        int feet = this.height / INCHES_PER_FOOT;
        int inches = this.height % INCHES_PER_FOOT;
        return String.format("%d feet %d inches", feet, inches);
    }

    /**
     *
     * @return
     */
    public double getWeight(){
        return this.weight;
    }

    /**
     * Set the weight in pounds
     * @param pounds pounds (lb)
     */
    public void setWeight(double pounds) throws IllegalArgumentException{
        checkWeight(pounds);
        this.weight = pounds;
    }

    /**
     *
     * @param kilograms
     * @throws IllegalArgumentException
     */
    public void setWeight(long kilograms) throws IllegalArgumentException{
        double kilogramsToPounds = (double)kilograms * POUNDS_PER_KG;
        checkWeight(kilogramsToPounds);
        this.weight = kilogramsToPounds;
    }

    /**
     *
     * @return
     */
    public long getWeightKg(){
        long poundsToKilograms = Math.round((long)this.weight / (long)POUNDS_PER_KG);
        return poundsToKilograms;
    }

    /**
     *
     * @return
     */
    public boolean getCanTravel(){
        return this.canTravel;
    }

    /**
     *
     * @param traveler
     */
    public void setCanTravel(boolean traveler){
        this.canTravel = traveler;
    }

    /**
     *
     * @return
     */
    public boolean getSmokes(){
        return this.smokes;
    }

    /**
     *
     * @param smoker
     */
    public void setSmokes(boolean smoker){
        this.smokes = smoker;
    }

    /**
     *
     * @return
     */
    public int calculatePayDollarsPerHour(){
        // All models get these two dollars.
        int amount = BASE_RATE_DOLLARS_PER_HOUR;
        if(getHeight() >= TALL_INCHES && getWeight() < THIN_POUNDS){
            amount += TALL_THIN_BONUS_DOLLARS_PER_HOUR;
        }
        //
        if(getCanTravel() == true){
            amount += TRAVEL_BONUS_DOLLARS_PER_HOUR;
        }
        if(getSmokes() == true) {
            amount -= SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
        }
        return amount;
    }

    /**
     * Prints detail information about this Model
     */
    public void printDetails() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeight() + " inches");
        System.out.println("Weight: " + Math.round(getWeight()) + " pounds");
        if(getCanTravel() == true){
            System.out.println("Does travel");
        }else{
            System.out.println("Does not travel");
        }
        if(getSmokes() == true){
            System.out.println("Does smoke");
        }else{
            System.out.println("Does not smoke");
        }
    }

    /**
     * Prints detail information about this Model including hourly rate
     */
    public void displayModelDetails(){
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeightInFeetAndInches());
        System.out.println("Weight: " + getWeight() + " pounds");
        if(getCanTravel() == true){
            System.out.println("Travels: yep");
        }else{
            System.out.println("Travels: nope");
        }
        if(getSmokes() == true){
            System.out.println("Smokes: yep");
        }else{
            System.out.println("Smokes: nope");
        }
        System.out.println("Hourly rate: " + "$" + calculatePayDollarsPerHour());
    }
}