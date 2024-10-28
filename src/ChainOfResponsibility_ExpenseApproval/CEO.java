package ChainOfResponsibility_ExpenseApproval;

public class CEO extends Approver {
    @Override
    public void handleRequest(ExpenseRequest request) {
        System.out.println("CEO approved the expense request for: " + request.getPurpose());
    }
}
