package model;

import java.util.Date;

public class Ticket {

    private String number;
    private String customer;
    private Affiliate affiliate;
    private PointOfService pointOfService;
    private Operator operator;
    private TypeOfService typeOfService;

    private Date issueTime;
    private Date startOfServicingTime;
    private Date endOfServicingTime;
    private Date calledTime;
    private long waitingDuration;
    private long serviceDuration;

    private int priority = 5;

    public TypeOfService getTypeOfService() {
        return typeOfService;
    }
}
