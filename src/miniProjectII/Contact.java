package miniProjectII;

public class Contact {
    private String name;
    private String mobile;

    public Contact(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
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

    @Override
    public String toString(){
        return "<" + getName() + "> (mobile=" + getMobile() + ")";
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }else if(o == null || o.getClass() != getClass()){
            return false;
        }else{
            Contact b = (Contact)o;
            if((b.getName() == getName()) && (b.getMobile() == getMobile())){
                return true;
            }else{
                return false;
            }
        }
    }
}
