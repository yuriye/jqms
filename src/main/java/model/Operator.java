package model;

import java.util.ArrayList;
import java.util.List;

public class Operator extends NamedEntity {
    private List<TypeOfService> typeOfServiceList = new ArrayList<>();

    public Operator(String name) {
        super(name);
    }

    public Operator(String name, List<TypeOfService> typeOfServiceList) {
        super(name);
        this.typeOfServiceList = typeOfServiceList;
    }

    public List<TypeOfService> getTypeOfServiceList() {
        return typeOfServiceList;
    }

    public void setTypeOfServiceList(List<TypeOfService> typeOfServiceList) {
        this.typeOfServiceList = typeOfServiceList;
    }
}
