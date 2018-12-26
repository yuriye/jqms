package model;

import java.util.ArrayList;
import java.util.List;

public class PointOfService extends NamedEntity {
    private List<TypeOfService> typeOfServiceList = new ArrayList<>();

    public PointOfService(String name) {
        super(name);
    }

    public PointOfService(String name, List<TypeOfService> typeOfServiceList) {
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
