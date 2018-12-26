package model;

public class TypeOfService extends NamedEntity {

    private String description;

    public TypeOfService(String name) {
        super(name);
    }

    public TypeOfService(String name, String description) {
        super(name);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
