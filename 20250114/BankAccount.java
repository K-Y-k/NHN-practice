import java.math.BigDecimal;
import java.util.Scanner;

public class BankAccount {
    private long accountNumber;
    private long cardNumber;
    private String ownerName;
    private BigDecimal balance;

    public void setData(String ownerName, BigDecimal i) {
        // 싱글톤으로 선언한 AccountNumberGenerator를 가져옴
        this.accountNumber = AccountNumberGenerator.getAccountNumberGenerator().nextNumber();
        this.cardNumber = AccountNumberGenerator.getAccountNumberGenerator().nextCardNumber();
        
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

    public long getAccountNumber() {
        return accountNumber;
    }
    public long getCardNumber() {
        return cardNumber;
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


class Test4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount();

        b1.setData("KYK", new BigDecimal("0.0"));
        b2.setData("Celine", new BigDecimal("0.0"));

        printBankAccount(b1);
        printBankAccount(b2);
        
        System.out.print("Enter amount to deposit: ");
        b1.deposit(new BigDecimal(sc.nextLine()));
        printBankAccount(b1);

        System.out.print("Enter amount to withdraw: ");
        b1.withdraw(new BigDecimal(sc.nextLine()));
        printBankAccount(b1);
        
        sc.close();
    }

    public static void printBankAccount(BankAccount account) {
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Owner Name: " + account.getOwnerName());
        System.out.println("Balance: " + account.getBalance());
        System.out.println();
    }
}
