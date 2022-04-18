package entity;

public class Customer {
    String name;
    String family;
    String uniqueId;
    public void setName(String name) {
    }

    public void setFamily(String family) {
    }

    public void setUniqueId(String uniqueId) {
    }
    public String getFullName(){
        return name+family;
    }
}
