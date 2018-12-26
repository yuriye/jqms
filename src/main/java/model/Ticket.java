package model;

import java.util.Date;

public class Ticket {

    private String number;
    private Date issueTime;
    private Date startOfServicingTime;
    private Date endOfServicingTime;
    private Date calledTime;
    private long waitingDuration;
    private long serviceDuration;
    private TypeOfService typeOfService;
    private String customer;
    private int priority = 5;


}
