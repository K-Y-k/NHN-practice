/* 계좌번호와 카드번호룰 생성하기위한 이 클래스를 
   싱글톤으로 만든 방식 */
public class AccountNumberGenerator {
    private static AccountNumberGenerator accountNumberGenerator;

    // private로 생성자를 막음
    private AccountNumberGenerator() {
    }

    // 하나의 객체로만 사용하는 생성 함수
    public static AccountNumberGenerator getAccountNumberGenerator() {
        if (accountNumberGenerator == null) {
            accountNumberGenerator = new AccountNumberGenerator();
        }
        return accountNumberGenerator;
    }

    private long nextAccountNumber; // 계좌번호
    private long nextCardNumber;    // 카드번호

    public long nextNumber() {
        return nextAccountNumber++;
    }

    public long nextCardNumber() {
        return nextCardNumber++;
    }
}
