package entity;

public class Customer {
    private String name;
    private String family;
    private String uniqueId;
    public void setName(String name) {
        this.name=name;
    }

    public void setFamily(String family) {
        this.family=family;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId=uniqueId;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public String getUniqueId() {
        return uniqueId;
    }
}
