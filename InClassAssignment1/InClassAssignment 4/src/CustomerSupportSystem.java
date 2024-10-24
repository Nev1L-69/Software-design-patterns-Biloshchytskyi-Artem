public class CustomerSupportSystem {
    private SupportHandler firstHandler;

    public CustomerSupportSystem() {
        SupportHandler juniorSupport = new JuniorSupport();
        SupportHandler midLevelSupport = new MidLevelSupport();
        SupportHandler seniorSupport = new SeniorSupport();

        juniorSupport.setNextHandler(midLevelSupport);
        midLevelSupport.setNextHandler(seniorSupport);

        firstHandler = juniorSupport;
    }

    public void processTicket(SupportTicket ticket) {
        firstHandler.handleRequest(ticket);
    }
}
