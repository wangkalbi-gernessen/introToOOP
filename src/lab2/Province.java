package lab2;

/**
 * @author Kazunobu Someya
 */
public class Province {
    private String name;
    private String capital;
    private long population;

    /**
     * set constant variable
     */
    public static final String DEFAULT_PROVINCE = "British Columbia";
    public static final String DEFAULT_CAPITAL = "Victoria";
    public static final long DEFAULT_POPULATION = 4_648_055;


    /**
     * first constructor
     * @param name
     * @param capital
     * @param population
     */
    public Province(String name, String capital, long population){
        if(isValidPopulation(population) && (isValidProvince(name) && isValidCapitalCity(capital))){
            setProvince(name);
            setCapitalCity(capital);
            setPopulation(population);
        }else{
            this.name = DEFAULT_PROVINCE;
            this.capital = DEFAULT_PROVINCE;
            this.population = DEFAULT_POPULATION;
        }
    }

    /**
     * second constructor
     */
    public Province(){
        this.name = DEFAULT_PROVINCE;
        this.capital = DEFAULT_PROVINCE;
        this.population = DEFAULT_POPULATION;
    }

    /**
     *
     * @param name
     * @return
     */
    private static boolean isValidProvince(String name){
        String[] provinces = {"Ontario", "Quebec", "British Columbia", "Alberta", "Manitoba", "Saskatchewan",
                            "Nova Scotia", "New Brunswick", "Newfoundland and Labrador", "Prince Edward Island"};
        for(int i = 0; i <= provinces.length - 1; i++){
            if(provinces[i] == name){
                return true;
            }
        }
        throw new IllegalArgumentException("Must be one of the 10 Canadian Provinces");
    }

    /**
     *
     * @param capital
     * @return
     */
    private static boolean isValidCapitalCity(String capital){
        String[] capitalCityName = {"Toronto", "Quebec City", "Victoria", "Edmonton", "Winnipeg", "Regina",
                                    "Halifax", "Fredericton", "St.John's", "Charlottetown"};
        for(int i = 0; i <= capitalCityName.length - 1; i++){
            if(capitalCityName[i] == capital){
                return true;
            }
        }
        throw new IllegalArgumentException("Must be the name of the capital city");
    }

    /**
     *
     * @param population
     * @return
     */
    private static boolean isValidPopulation(long population){
        if(population >= 30_000 && population <= 15_000_000){
            return true;
        }else{
            throw new IllegalArgumentException("Must be between 30,000 and 15,000,000");
        }
    }


    public String getProvince(){
        return this.name;
    }

    public void setProvince(String name){
        this.name = name;
    }

    public String getCapitalCity(){
        return this.capital;
    }

    public void setCapitalCity(String capital){
        this.capital = capital;
    }

    public long getPopulation(){
        return this.population = population;
    }

    public void setPopulation(long population){
        this.population = population;
    }

    public String getDetails(){
        return "Tha capital of " + getProvince() + " (population. " + getPopulation() + ") is " + getCapitalCity() + ".";
    }
}
