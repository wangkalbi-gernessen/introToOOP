package lab1;


/**
 * @author Kazunobu Someya
 */
public class ModelValidation {
    /**
     *
     * @param firstName
     */
    public static void checkFirstName(String firstName){
        if(firstName.length() < 3 && firstName.length() > 20) {
            throw new IllegalArgumentException("firstname should be between 3 and 20");
        }
    }

    /**
     *
     * @param lastName
     */
    public static void checkLastName(String lastName){
        if (lastName.length() < 3 && lastName.length() > 20) {
            throw new IllegalArgumentException("lastname should be between 3 and 20");
        }
    }

    /**
     *
     * @param inches
     */
    public static void checkHeight(int inches){
        if(inches < 24 && inches > 84){
            throw new IllegalArgumentException("height must be 24 to 84 inches");
        }
    }

    /**
     *
     * @param pounds
     */
    public static void checkWeight(double pounds){
        if(pounds < 80 && pounds > 280){
            throw new IllegalArgumentException("weight must be 80 to 280 pounds");
        }
    }
}
