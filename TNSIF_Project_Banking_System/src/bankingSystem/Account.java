package bankingSystem;

public class Account {
    private int accountId;
    private int customerId;
    private String type;
    private double balance;

    public Account(int accountId, int customerId, String type, double balance) {
        this.accountId = accountId;
        this.customerId = customerId;
        this.type = type;
        this.balance = balance;
    }

    public int getAccountID() 
    { 
        return accountId; 
    }
    public void setAccountID(int accountId) 
    { 
        this.accountId = accountId; 
    }

    public int getCustomerID() 
    { 
        return customerId; 
    }
    public void setCustomerID(int customerId)
    { 
        this.customerId = customerId; 
    }

    public String getType() 
    { 
        return type; 
    }
    public void setType(String type) 
    { 
        this.type = type; 
    }

    public double getBalance() 
    { 
        return balance; 
    }
    public void setBalance(double balance) 
    { 
        this.balance = balance; 
    }

    @Override
    public String toString() {
        return "Account Id: " + accountId + ", Customer Id: " + customerId + ", Balance: " + balance;
    }
}

    
