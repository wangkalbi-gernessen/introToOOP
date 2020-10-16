package lab2;

public class Canada {
    private Province[] provinces;

    /**
     * Thanks to Takayuki I was able to make following objects
     */
    public Canada(){
        this.provinces = new Province[]{
                new Province("Ontario", "Toronto", 13_448_494),
                new Province("Quebec", "Quebec City", 8_164_361),
                new Province("British Columbia", "Victoria", 4_648_055),
                new Province("Alberta", "Edmonton", 4_067_175),
                new Province("Manitoba", "Winnipeg", 1_278_365),
                new Province("Saskatchewan", "Regina", 1_098_352),
                new Province("Nova Scotia", "Halifax", 923_598),
                new Province("New Brunswick", "Fredericton", 747_101),
                new Province("Newfoundland and Labrador", "St.John's", 519_716),
                new Province("Prince Edward Island", "Charlottetown", 142_907),
        };

    }

    public void displayAllProvinces(){
        for(Province elem : provinces){
            System.out.println(elem.getDetails());
        }
    }

    public int getNumOfProvincesBetween(int mix, int max){
        mix *= 1_000_000;
        max *= 1_000_000;
        int count = 0;
        for(Province elem : provinces){
            if(elem.getPopulation() >= mix && elem.getPopulation() <= max){
                count += 1;
            }
        }
        return count;
    }
}
