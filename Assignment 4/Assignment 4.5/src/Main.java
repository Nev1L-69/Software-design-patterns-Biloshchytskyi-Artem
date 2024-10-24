// Main.java
public class Main {
    public static void main(String[] args) {
        // Create the approval chain
        ApprovalChain approvalChain = new ApprovalChain();

        // Create some expense requests
        ExpenseRequest request1 = new ExpenseRequest(500, "Office Supplies");
        ExpenseRequest request2 = new ExpenseRequest(3000, "Team Building Event");
        ExpenseRequest request3 = new ExpenseRequest(15000, "New Equipment");
        ExpenseRequest request4 = new ExpenseRequest(30000, "Corporate Training");

        // Process the requests
        approvalChain.processRequest(request1);
        approvalChain.processRequest(request2);
        approvalChain.processRequest(request3);
        approvalChain.processRequest(request4);
    }
}
