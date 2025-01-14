import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        BankAccount ac1 = new BankAccount();
        ac1.setData("James", new BigDecimal("100"));
        
        BankAccount ac2 = new BankAccount();
        ac2.setData("Celine", new BigDecimal("1000"));

        System.out.println("Before transfer: ");
        displayAccountInfo(ac1);
        displayAccountInfo(ac2);

        ac1.transferFrom(ac2, new BigDecimal("10.0"));

        System.out.println("After transfer: ");
        displayAccountInfo(ac1);
        displayAccountInfo(ac2);
    }


    public static void displayAccountInfo(BankAccount ac) {
        System.out.printf("AccountNo: %d, Owner: %s, balance: %s\n",
        ac.getNumber(), ac.getOwnerName(), ac.getBalance());
    }
}
