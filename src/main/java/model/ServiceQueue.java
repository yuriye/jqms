package model;

import java.util.*;

public class ServiceQueue {

    private static Map<Affiliate, Map<TypeOfService, ServiceQueue>> instances = new HashMap<>();

    Affiliate affiliate;
    private TypeOfService typeOfService;
    private Date scheduleStartTime;
    private Date scheduleEndTime;
    private Date startTime = new Date();
    private Date endTime;
    List<Ticket> history = new ArrayList<>();
    List<Ticket> activeTickets = new ArrayList<>();

    private ServiceQueue(Affiliate affiliate, TypeOfService typeOfService, Date date) {
        this.affiliate = affiliate;
        this.typeOfService = typeOfService;
        AffiliateShedule affiliateShedule = AffiliateShedule.getShedule(affiliate, typeOfService, date);
        this.scheduleStartTime = affiliateShedule.getScheduleStartTime();
        this.scheduleEndTime = affiliateShedule.getScheduleEndTime();
    }

    public ServiceQueue getInstance(Affiliate affiliate, TypeOfService typeOfService) {
        if (instances.get(affiliate) == null) {
            instances.put(affiliate, new HashMap<>());
        }
        ServiceQueue serviceQueue;
        if ((serviceQueue = instances.get(affiliate).get(typeOfService)) == null) {
            serviceQueue = new ServiceQueue(affiliate, typeOfService, new Date());
            instances.get(affiliate).put(typeOfService, serviceQueue);
        }
        return serviceQueue;
    }

    public void add(Ticket ticket) {
        activeTickets.add(ticket);
    }

    public static Map<Affiliate, Map<TypeOfService, ServiceQueue>> getInstances() {
        return instances;
    }

    public Affiliate getAffiliate() {
        return affiliate;
    }

    public TypeOfService getTypeOfService() {
        return typeOfService;
    }

    public Date getScheduleStartTime() {
        return scheduleStartTime;
    }

    public Date getScheduleEndTime() {
        return scheduleEndTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public List<Ticket> getHistory() {
        return history;
    }

    public List<Ticket> getActiveTickets() {
        return activeTickets;
    }

    public void setScheduleStartTime(Date scheduleStartTime) {
        this.scheduleStartTime = scheduleStartTime;
    }

    public void setScheduleEndTime(Date scheduleEndTime) {
        this.scheduleEndTime = scheduleEndTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
