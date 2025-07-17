package bankingSystem;

import java.util.*;

public class BankingSystemApp {
    public static void main(String[] args) {
        BankingService bank = new BankingServiceImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nBanking System");
            System.out.println("1. Add Customers\n2. Add Accounts\n3. Add Beneficiary\n4. Add Transaction");
            System.out.println("5. Find Customer by ID\n6. List Customer Accounts\n7. List Account Transactions");
            System.out.println("8. List Customer Beneficiaries\n9. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (ch) {
                case 1 -> {
                    System.out.println("Enter Customer Details");
                    System.out.println("Customer ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Address: ");
                    String address = sc.nextLine();
                    System.out.print("Contact: ");
                    String contact = sc.nextLine();
                    bank.addCustomer(new Customer(id, name, address, contact));
                }
                case 2 -> {
                    System.out.println("Enter Accounts Details");
                    System.out.println("Account ID: ");
                    int aid = sc.nextInt();
                    System.out.print("Customer ID: ");
                    int cid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Account Type (Saving/Current): ");
                    String type = sc.nextLine();
                    System.out.print("Balance: ");
                    double balance = sc.nextDouble();
                    bank.addAccount(new Account(aid, cid, type, balance));
                }
                case 3 -> {
                    System.out.println("Enter Beneficiary Details");
                    System.out.println("Beneficiary ID: ");
                    int bid = sc.nextInt();
                    System.out.print("Customer ID: ");
                    int cid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Beneficiary Name: ");
                    String bname = sc.nextLine();
                    System.out.print("Account Number: ");
                    String accNo = sc.nextLine();
                    System.out.print("Bank Details: ");
                    String bdetails = sc.nextLine();
                    bank.addBeneficiary(new Beneficiary(bid, cid, bname, accNo, bdetails));
                }
                case 4 -> {
                    System.out.print("Account ID: ");
                    int aid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Type (Deposit/Withdrawal): ");
                    String type = sc.nextLine();
                    System.out.print("Amount: ");
                    double amt = sc.nextDouble();
                    bank.addTransaction(new Transaction(0, aid, type, amt)); // ID auto-incremented
                }
                case 5 -> {
                    System.out.print("Customer ID: ");
                    int id = sc.nextInt();
                    Customer c = bank.findCustomerById(id);
                    System.out.println(c != null ? c : "Customer not found.");
                }
                case 6 -> {
                    System.out.print("Customer ID: ");
                    int cid = sc.nextInt();
                    List<Account> accs = bank.getAccountsByCustomerId(cid);
                    accs.forEach(System.out::println);
                }
                case 7 -> {
                    System.out.print("Account ID: ");
                    int aid = sc.nextInt();
                    List<Transaction> trans = bank.getTransactionsByAccountId(aid);
                    trans.forEach(System.out::println);
                }
                case 8 -> {
                    System.out.print("Customer ID: ");
                    int cid = sc.nextInt();
                    List<Beneficiary> bens = bank.getBeneficiariesByCustomerId(cid);
                    bens.forEach(System.out::println);
                }
                case 9 -> {
                    System.out.println("Thank you!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
