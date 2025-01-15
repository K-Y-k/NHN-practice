import java.math.*;
import java.util.Scanner;

public class BankAccount {
    private long accountNumber;
    private String ownerName;
    private BigDecimal balance;

    //
    // AccountType variable
    //
    private AccountType accountType;

    private static long nextAccountNumber;

    //
    // default constructor
    //
    public BankAccount() {
        // this.accountNumber = nextNumber();
        // this.accountType = AccountType.Checking;
        // this.balance = new BigDecimal("0");

        // 생성자 오버로딩을 활용하여 리펙토링
        this(null, new BigDecimal("0"), AccountType.Checking);
    }

    public BankAccount(AccountType accountType) {
        // this.accountNumber = nextNumber();
        // this.accountType = accountType;
        // this.balance = new BigDecimal("0");
        // this.ownerName = "Unknown";

        // 생성자 오버로딩을 활용하여 리펙토링
        this("Unknown", new BigDecimal("0"), accountType);
    }

    public BankAccount(String ownerName, BigDecimal balance) {
        // this.accountNumber = nextNumber();
        // this.accountType = AccountType.Checking;
        // this.ownerName = ownerName;
        // this.balance = balance;

        // 생성자 오버로딩을 활용하여 리펙토링
        this(ownerName, balance, AccountType.Checking);
    }

    public BankAccount(String ownerName, BigDecimal balance, AccountType accountType) {
        this.accountNumber = nextNumber();
        this.ownerName = ownerName;
        this.balance = balance;
        this.accountType = accountType;
    }
    

    private static long nextNumber() {
        return nextAccountNumber++;
    }
        
    public long getNumber() {
        return this.accountNumber;
    }
        
    public String getOwnerName() {
        return this.ownerName;
    }
        
    public BigDecimal getBalance() {
        return this.balance;
    } 

    //
    // getAccountType method
    //
    public AccountType getAccountType() {
        return this.accountType;
    }
    
    public BigDecimal deposit(BigDecimal amount) {
        this.balance = this.balance.add(amount);
        return this.balance;
    }

    public boolean withDraw(BigDecimal amount) {
        if (amount.compareTo(this.balance) == 1 || amount.compareTo(this.balance) == 0) {
            return false;
        }
        else {
            balance = balance.subtract(amount);
            return true;
        }
    }

    public void transferFrom(BankAccount accFrom, BigDecimal amount) {
        if (accFrom.withDraw(amount)) {
            this.deposit(amount);
        }
    }
}

class CreateAccount {
    public static void TestDeposit(BankAccount account) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        BigDecimal amount = new BigDecimal(scanner.next());
        account.deposit(amount);
        scanner.close();
    }

    public static void TestWithDraw(BankAccount account) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        BigDecimal amount = new BigDecimal(scanner.next());
        if(!account.withDraw(amount)) {
            System.out.println("Insufficient funds!");
        }
        scanner.close();
    }

    public static void main(String[] args) {
        BankAccount ac1, ac2, ac3, ac4;

        ac1 = new BankAccount();
        ac2 = new BankAccount(AccountType.Deposit);
        ac3 = new BankAccount("James", new BigDecimal("100"));
        ac4 = new BankAccount("Jason", new BigDecimal("100"), AccountType.Saving);

        printBankAccount(ac1);
        printBankAccount(ac2);
        printBankAccount(ac3);
        printBankAccount(ac4);
    }

    public static void printBankAccount(BankAccount account) {
        System.out.println("Account Number: " + account.getNumber());
        System.out.println("Owner Name: " + account.getOwnerName());
        System.out.println("Account Type: " + account.getAccountType());
        System.out.println("Balance: " + account.getBalance() + "\n");
    }
}