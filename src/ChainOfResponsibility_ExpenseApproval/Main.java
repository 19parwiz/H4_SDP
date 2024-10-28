package ChainOfResponsibility_ExpenseApproval;

public class Main {
    public static void main(String[] args) {
        ApprovalChain approvalChain = new ApprovalChain();

        // Example expense requests
        ExpenseRequest request1 = new ExpenseRequest(500, "Team lunch");
        ExpenseRequest request2 = new ExpenseRequest(2000, "New laptops");
        ExpenseRequest request3 = new ExpenseRequest(7500, "Office renovation");
        ExpenseRequest request4 = new ExpenseRequest(20000, "Annual conference sponsorship");

        // Process each request
        approvalChain.processRequest(request1); // Expected: Team Lead approves
        approvalChain.processRequest(request2); // Expected: Manager approves
        approvalChain.processRequest(request3); // Expected: Director approves
        approvalChain.processRequest(request4); // Expected: CEO approves
    }
}
