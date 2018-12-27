package model;

import java.util.Date;

public class AffiliateShedule {

    private TypeOfService typeOfService;
    private Date scheduleStartTime;
    private Date scheduleEndTime;

    public AffiliateShedule(TypeOfService typeOfService, Date scheduleStartTime, Date scheduleEndTime) {
        this.typeOfService = typeOfService;
        this.scheduleStartTime = scheduleStartTime;
        this.scheduleEndTime = scheduleEndTime;
    }

    public static AffiliateShedule getShedule(Affiliate affiliate, TypeOfService typeOfService, Date date) {
        return null;
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
}
