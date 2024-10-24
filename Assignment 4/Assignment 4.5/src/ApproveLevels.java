// TeamLead.java
class TeamLead extends Approver {
    @Override
    public void approveExpense(ExpenseRequest request) {
        if (request.getAmount() <= 1000) {
            System.out.println("TeamLead approved the expense for: " + request.getPurpose());
        } else if (nextApprover != null) {
            nextApprover.approveExpense(request);
        }
    }
}

// Manager.java
class Manager extends Approver {
    @Override
    public void approveExpense(ExpenseRequest request) {
        if (request.getAmount() <= 5000) {
            System.out.println("Manager approved the expense for: " + request.getPurpose());
        } else if (nextApprover != null) {
            nextApprover.approveExpense(request);
        }
    }
}

// Director.java
class Director extends Approver {
    @Override
    public void approveExpense(ExpenseRequest request) {
        if (request.getAmount() <= 20000) {
            System.out.println("Director approved the expense for: " + request.getPurpose());
        } else if (nextApprover != null) {
            nextApprover.approveExpense(request);
        }
    }
}

// CEO.java
class CEO extends Approver {
    @Override
    public void approveExpense(ExpenseRequest request) {
        if (request.getAmount() > 20000) {
            System.out.println("CEO approved the expense for: " + request.getPurpose());
        } else if (nextApprover != null) {
            nextApprover.approveExpense(request);
        }
    }
}
