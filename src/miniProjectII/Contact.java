package miniProjectII;

public class Contact {
    private int index;
    private String name;
    private String mobile;
    private String work;
    private String home;
    private String city;

    public Contact(int index, String name, String mobile, String work, String home, String city) {
        this.index = index;
        this.name = name;
        this.mobile = mobile;
        this.work = work;
        this.home = home;
        this.city = city;
    }

    public int getIndex(){
        return this.index;
    }

    public void setIndex(int index){
        this.index = index;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getMobile(){
        return this.mobile;
    }

    public void setMobile(String mobile){
        this.mobile = mobile;
    }

    public String getWork(){
        return this.work;
    }

    public void setWork(String work){
        this.work = work;
    }

    public String getHome(){
        return this.home;
    }

    public void setHome(String home){
        this.home = home;
    }

    public String getCity(){
        return this.city;
    }

    public void setCity(String city){
        this.city = city;
    }

    @Override
    public String toString(){
        return getIndex() + ". <" + getName() + "> (mobile=" + getMobile() + ", work=" + getWork() + ", home=" + getHome() + ", city=" + getCity() + ")";
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }else if(o == null || o.getClass() != getClass()){
            return false;
        }else{
            Contact b = (Contact)o;
            if((b.getName() == getName()) && (b.getMobile() == getMobile()) && (b.getIndex() == getIndex() && (b.getWork() == getWork()) && (b.getHome() == getHome()) && (b.getCity() == getCity()))){
                return true;
            }else{
                return false;
            }
        }
    }
}
