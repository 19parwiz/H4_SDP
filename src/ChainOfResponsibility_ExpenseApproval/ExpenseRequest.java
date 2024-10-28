package ChainOfResponsibility_ExpenseApproval;

public class ExpenseRequest {
    private final double amount;
    private final String purpose;

    public ExpenseRequest(double amount, String purpose) {
        this.amount = amount;
        this.purpose = purpose;
    }

    public double getAmount() {
        return amount;
    }

    public String getPurpose() {
        return purpose;
    }
}
