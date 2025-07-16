package bankingSystem;

import java.time.LocalDateTime;

public class Transaction {
    private int transactionId;
    private int accountId;
    private String type;
    private double amount;
    private LocalDateTime timestamp;

    public Transaction(int transactionId, int accountId, String type, double amount) {
        this.transactionId = transactionId;
        this.accountId = accountId;
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }

    public int getTransactionID() { return transactionId; }
    public int getAccountID() { return accountId; }
    public String getType() { return type; }
    public double getAmount() { return amount; }
    public LocalDateTime getTimestamp() { return timestamp; }

    @Override
    public String toString() {
        return "Transaction ID: " + transactionId + ", Type: " + type + ", Amount: " + amount + ", Timestamp: " + timestamp;
    }
}
