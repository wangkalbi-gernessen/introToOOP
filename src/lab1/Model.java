package lab1;

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
    // Put new field to make string type of variable of a sequence of feet and inch
    private String inchesToFeet;
    private long weightKg;

    // constant variable
    public static final int INCHES_PER_FOOT = 12;
    public static final double POUNDS_PER_KG = 2.2046;
    public static final int BASE_RATE_DOLLARS_PER_HOUR = 60;
    public static final int TALL_INCHES = 67;
    public static final double THIN_POUNDS = 140.0;
    public static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
    public static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
    public static final int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;

    // @param
    // Make first constructor
    public Model(){

    }

    // @param
    // Make second constructor
    public Model(String firstName, String lastName, int heightInches, double weightPounds, boolean traveler, boolean smoker){
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(heightInches);
        setWeight(weightPounds);
        setCanTravel(traveler);
        setSmokes(smoker);
    }

    // @param
    // Make third constructor
    public Model(String firstName, String lastName, int heightInches, double weightPounds){
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(heightInches);
        setWeight(weightPounds);
        setCanTravel(true);
        setSmokes(false);
    }

    // @return
    // Get firstname
    public String getFirstName(){
        return this.firstName;
    }

    // @param
    // Set firstname
    public void setFirstName(String firstName){
        if(firstName.length() >= 3 && firstName.length() <= 20){
            this.firstName = firstName;
        }
    }

    // @return
    // Get lastname
    public String getLastName(){
        return this.lastName;
    }

    // @param
    // Set lastname
    public void setLastName(String lastName){
        if(lastName.length() >= 3 && lastName.length() <= 20){
            this.lastName = lastName;
        }
    }

    // @return
    // Get height in inches
    public int getHeight(){
        return this.height;
    }

    // @param
    // Set height in inches
    public void setHeight(int inches){
        if(inches >= 24 && inches <= 84){
            this.height = inches;
        }
        int foot = inches / INCHES_PER_FOOT;
        int inch = inches % INCHES_PER_FOOT;
        setHeight(foot, inch);
    }

    // @param
    public void setHeight(int feet, int inches){
        if(inches == 1){
            this.inchesToFeet = feet + " feet " + inches + " inch";
        }else{
            this.inchesToFeet = feet + " feet " + inches + " inches";
        }
    }

    // @return
    // Get the weight in pounds
    public double getWeight(){
        return this.weight;
    }

    /**
     * Set the weight in pounds
     * @param pounds pounds (lb)
     */
    public void setWeight(double pounds) {
        if(pounds >= 80 && pounds <= 280){
            this.weight = pounds;
        }
        long kilograms = (long)(pounds / POUNDS_PER_KG);
    }

        // @param
    public void setWeight(long kilograms){
        this.weightKg = kilograms;
    }

    // @return
    // Get canTravel
    public boolean getCanTravel(){
        return this.canTravel;
    }


    // @param
    // Set canTravel
    public void setCanTravel(boolean traveler){
        this.canTravel = traveler;
    }

    // @return
    // Get smokes
    public boolean getSmokes(){
        return this.smokes;
    }

    // @param
    // Set smokes
    public void setSmokes(boolean smoker){
        this.smokes = smoker;
    }

    /**
     * Returns the height in feet and inches
     * @return the height in feet and inches
     */
    public String getHeightInFeetAndInches() {
        return this.inchesToFeet;
    }

    // @return
    public long getWeightKg(){
        return this.weightKg;
    }

    public int calculatePayDollarsPerHour(){
        // All models get these two dollars.
        int amount = BASE_RATE_DOLLARS_PER_HOUR + TALL_THIN_BONUS_DOLLARS_PER_HOUR;
        //
        if(getCanTravel() == true){
            amount += TRAVEL_BONUS_DOLLARS_PER_HOUR;
        }else{
            amount += 0;
        }

        if(getSmokes() == true){
            amount -= SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
        }else{
            amount -= 0;
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

    public void displayModelDetails(){
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeightInFeetAndInches());
        System.out.println("Weight: " + Math.round(getWeight()) + " pounds");
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