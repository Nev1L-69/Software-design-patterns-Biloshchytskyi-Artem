// ApprovalChain.java
public class ApprovalChain {
    private Approver firstApprover;

    public ApprovalChain() {
        // Create the approvers
        TeamLead teamLead = new TeamLead();
        Manager manager = new Manager();
        Director director = new Director();
        CEO ceo = new CEO();

        // Set up the chain
        teamLead.setNextApprover(manager);
        manager.setNextApprover(director);
        director.setNextApprover(ceo);

        // Assign the first approver
        firstApprover = teamLead;
    }

    public void processRequest(ExpenseRequest request) {
        firstApprover.approveExpense(request);
    }
}
