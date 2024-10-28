package ChainOfResponsibility_ExpenseApproval;

public class TeamLead extends Approver {
    private static final double APPROVAL_LIMIT = 1000;

    @Override
    public void handleRequest(ExpenseRequest request) {
        if (request.getAmount() <= APPROVAL_LIMIT) {
            System.out.println("Team Lead approved the expense request for: " + request.getPurpose());
        } else if (nextApprover != null) {
            nextApprover.handleRequest(request);
        }
    }
}
