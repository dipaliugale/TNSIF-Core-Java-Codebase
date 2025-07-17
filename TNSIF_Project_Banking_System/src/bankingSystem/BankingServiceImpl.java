package bankingSystem;

import java.util.*;

public class BankingServiceImpl implements BankingService {
    private Map<Integer, Customer> customers = new HashMap<>();
    private Map<Integer, Account> accounts = new HashMap<>();
    private Map<Integer, Transaction> transactions = new HashMap<>();
    private Map<Integer, Beneficiary> beneficiaries = new HashMap<>();
    private int transactionCounter = 1;

    @Override
    public void addCustomer(Customer customer) 
    {
        customers.put(customer.getCustomerId(), customer);
    }

    @Override
    public void addAccount(Account account) 
    {
        accounts.put(account.getAccountID(), account);
    }

    @Override
    public void addTransaction(Transaction transaction) {
        Account acc = accounts.get(transaction.getAccountID());
        if (acc != null) {
            if (transaction.getType().equalsIgnoreCase("deposit")) {
                acc.setBalance(acc.getBalance() + transaction.getAmount());
            } else if (transaction.getType().equalsIgnoreCase("withdrawal")) {
                if (acc.getBalance() >= transaction.getAmount()) {
                    acc.setBalance(acc.getBalance() - transaction.getAmount());
                } else {
                    System.out.println("Insufficient balance.");
                    return;
                }
            }
            transactions.put(transactionCounter++, transaction);
        }
    }

    @Override
    public void addBeneficiary(Beneficiary beneficiary) 
    {
        beneficiaries.put(beneficiary.getBeneficiaryID(), beneficiary);
    }

    @Override
    public Customer findCustomerById(int id) 
    {
        return customers.get(id);
    }

    @Override
    public Account findAccountById(int id) 
    {
        return accounts.get(id);
    }

    @Override
    public Transaction findTransactionById(int id) 
    {
        return transactions.get(id);
    }

    @Override
    public Beneficiary findBeneficiaryById(int id) {
        return beneficiaries.get(id);
    }

    @Override
    public List<Account> getAccountsByCustomerId(int customerId) {
        List<Account> result = new ArrayList<>();
        for (Account acc : accounts.values()) {
            if (acc.getCustomerID() == customerId)
                result.add(acc);
        }
        return result;
    }

    @Override
    public List<Transaction> getTransactionsByAccountId(int accountId) {
        List<Transaction> result = new ArrayList<>();
        for (Transaction t : transactions.values()) {
            if (t.getAccountID() == accountId)
                result.add(t);
        }
        return result;
    }

    @Override
    public List<Beneficiary> getBeneficiariesByCustomerId(int customerId) {
        List<Beneficiary> result = new ArrayList<>();
        for (Beneficiary b : beneficiaries.values()) {
            if (b.getCustomerID() == customerId)
                result.add(b);
        }
        return result;
    }

    @Override
    public Collection<Account> getAllAccounts() 
    { 
        return accounts.values(); 
    }
    @Override
    public Collection<Customer> getAllCustomers() 
    { 
        return customers.values(); 
    }
    @Override
    public Collection<Transaction> getAllTransactions() 
    { 
        return transactions.values(); 
    }
    @Override
    public Collection<Beneficiary> getAllBeneficiaries() 
    { 
        return beneficiaries.values(); 
    }
}
