package model;

public class TicketTerminal extends NamedEntity {
    private Affiliate affiliate;

    public TicketTerminal(String name, Affiliate affiliate) {
        super(name);
        this.affiliate = affiliate;
    }

    public Affiliate getAffiliate() {
        return affiliate;
    }




}
