// JuniorSupport.java
class JuniorSupport extends SupportHandler {
    @Override
    public void handleRequest(SupportTicket ticket) {
        if (ticket.getComplexity() <= 3) {
            System.out.println("Junior Support: Handling ticket with issue type " + ticket.getIssueType());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(ticket);
        } else {
            System.out.println("Junior Support: Unable to handle the ticket. No further support available.");
        }
    }
}

// MidLevelSupport.java
class MidLevelSupport extends SupportHandler {
    @Override
    public void handleRequest(SupportTicket ticket) {
        if (ticket.getComplexity() <= 6) {
            System.out.println("Mid-Level Support: Handling ticket with issue type " + ticket.getIssueType());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(ticket);
        } else {
            System.out.println("Mid-Level Support: Unable to handle the ticket. No further support available.");
        }
    }
}

// SeniorSupport.java
class SeniorSupport extends SupportHandler {
    @Override
    public void handleRequest(SupportTicket ticket) {
        if (ticket.getComplexity() <= 10) {
            System.out.println("Senior Support: Handling ticket with issue type " + ticket.getIssueType());
        } else {
            System.out.println("Senior Support: Unable to handle the ticket. It is too complex.");
        }
    }
}
