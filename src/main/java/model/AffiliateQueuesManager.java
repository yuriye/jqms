package model;

import java.util.ArrayList;
import java.util.List;

public class AffiliateQueuesManager {

    Affiliate affiliate;
    List<ServiceQueue> serviceQueueList = new ArrayList<>();
    List<TicketTerminal> ticketTerminalList = new ArrayList<>();
    List<PointOfService> pointOfServiceList = new ArrayList<>();

    public Ticket getTicket(TypeOfService typeOfService) {

        Ticket ticket = new Ticket();
        for (ServiceQueue serviceQueue: serviceQueueList) {
            if (serviceQueue.getTypeOfService().equals(typeOfService)) {
                serviceQueue.add(ticket);
            }
        }

        return null;

    }

    public boolean canCreateTicket(TypeOfService typeOfService) {
        return true;
    }

}
