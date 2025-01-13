import java.math.*;
import java.util.Scanner;

public class BankAccount {
    private long accountNumber;
    private String ownerName;
    private BigDecimal balance;

    // 공통으로 사용되는 순서번호
    private static long nextAccountNumber;

    private static long nextNumber() {
        return nextAccountNumber++;
    }


    //
    // setData method
    //
    public void setData(String ownerName, BigDecimal i) {
        this.accountNumber = nextNumber();
        this.ownerName = ownerName;
        balance = i;
    }

    public void setAccountNumber(long i) {
        accountNumber = i;
    }
    public void setOwnerName(String s) {
        ownerName = s;
    }
    public void setBalance(BigDecimal i) {
        balance = i;
    }

    //
    // getNumber method
    //
    public long getAccountNumber() {
        return accountNumber;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public BigDecimal getBalance() {
        return balance;
    }


    public BigDecimal deposit(BigDecimal amount) {
        this.balance = this.balance.add(amount);
        return balance;
    }

    public boolean withdraw(BigDecimal amount) {
        // BigDecimal의 compareTo 메소드는
        // 크면 1, 같으면 0, 작으면 -1이 나온다.
        if (amount.compareTo(this.balance) == 1 || amount.compareTo(this.balance) == 0) {
            return false;
        } else {
            balance = balance.subtract(amount);
            return true;
        }
    }
}

class CreateAccount {
    /* Scanner클래스는 한번 닫으면 다시 생성한다고 열리지 않기에
     * 전역변수로 선언하여 사용하고 마지막에 닫아주자.
     */
    static Scanner sc = new Scanner(System.in);

    public static BankAccount createNewBankAccount(String ownerName, BigDecimal balance) {
        BankAccount newAccount = new BankAccount();
        
        // newAccount.accountNumber = accountNumber;
        // newAccount.ownerName = ownerName;
        // newAccount.balance = balance;

        newAccount.setData(ownerName, balance);

        return newAccount;
    }

    public static void main(String[] args) {
       BankAccount bankAccount1 = CreateAccount.createNewBankAccount("Vesper Lind", new BigDecimal("0.0"));
       BankAccount bankAccount2 = CreateAccount.createNewBankAccount("Celine", new BigDecimal("1.0"));

       printBankAccount(bankAccount1);
       printBankAccount(bankAccount2);
        
       TestDeposit(bankAccount1);
       printBankAccount(bankAccount1);

       TestWithDraw(bankAccount1);
       printBankAccount(bankAccount1);
       
       sc.close();
    }

    public static void printBankAccount(BankAccount account) {
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Owner Name: " + account.getOwnerName());
        System.out.println("Balance: " + account.getBalance());
        System.out.println();
    }

    public static void TestDeposit(BankAccount account) {
        System.out.print("Enter amount to deposit: ");
        BigDecimal amount = new BigDecimal(sc.nextLine());

        account.deposit(amount);
    }

    public static void TestWithDraw(BankAccount account) {
        System.out.print("Enter amount to withdraw: ");
        BigDecimal amount = new BigDecimal(sc.nextLine());

        if(!account.withdraw(amount)) {
            System.out.println("Insufficient funds!");
        }
    }
}