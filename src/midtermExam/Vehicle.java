package midtermExam;

/**
 * @author Kazunobu Someya
 */
public abstract class Vehicle implements Steerable {
    private String productId;
    private Integer weight;

    public Vehicle(String productId, Integer weight){
        this.productId = productId;
        if(weight == null){
            this.weight = null;
        }
        this.weight = weight;
    }

    public String getProductId(){
        return this.productId;
    }

    public void setProductId(String productId){
        this.productId = productId;
    }

    public int getWeight(){
        return this.weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    @Override
    public String toString(){
        return "Vehicle{productId='" + getProductId() + "', weight=" + getWeight() + "}";
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }else if(o == null || o.getClass() != getClass()){
            return false;
        }
        Vehicle b = (Vehicle)o;
        if((b.getProductId() == getProductId())){
            return true;
        }else{
            return false;
        }
    }
}