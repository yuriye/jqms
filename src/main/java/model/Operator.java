package model;

import java.util.ArrayList;
import java.util.List;

public class Operator extends NamedEntity {
    private List<TypeOfService> typeOfServiceList = new ArrayList<>();
    private Affiliate affiliate;

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

    public Operator(String name, List<TypeOfService> typeOfServiceList, Affiliate affiliate) {
        super(name);
        this.typeOfServiceList = typeOfServiceList;
        this.affiliate = affiliate;
    }

    public Affiliate getAffiliate() {
        return affiliate;
    }
}
