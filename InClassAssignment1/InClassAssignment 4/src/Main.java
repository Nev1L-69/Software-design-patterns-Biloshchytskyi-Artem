public class Main {
    public static void main(String[] args) {
        CustomerSupportSystem supportSystem = new CustomerSupportSystem();

        // Create some support tickets with varying complexity
        SupportTicket ticket1 = new SupportTicket("Password Reset", 2);
        SupportTicket ticket2 = new SupportTicket("Software Installation", 5);
        SupportTicket ticket3 = new SupportTicket("Network Configuration", 8);
        SupportTicket ticket4 = new SupportTicket("Database Corruption", 11);

        // Process the tickets
        System.out.println("Processing Ticket 1:");
        supportSystem.processTicket(ticket1);

        System.out.println("\nProcessing Ticket 2:");
        supportSystem.processTicket(ticket2);

        System.out.println("\nProcessing Ticket 3:");
        supportSystem.processTicket(ticket3);

        System.out.println("\nProcessing Ticket 4:");
        supportSystem.processTicket(ticket4);
    }
}
