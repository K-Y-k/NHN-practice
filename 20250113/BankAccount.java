public class BankAccount {
    // 클래스 안에 클래스를 만들 수 있다.
    // 1. 상속없이 계층 구조를 만들어야 할 때 (자바에서는 이렇게 안씀)
    // 2. static class를 사용하여 사용 ex) Builder객체의 각기 다른 구현체 클래스를 생성하여 사용할 때
    static class Bank {
        private int no;        // 계좌 번호
        private String name;   // 주인 이름
        private int balance;   // 잔고
        
        // 이자는 모든 객체에 공통된 값을 가져야 하므로 static 사용
        static int interestRate = 2;


        public void setBalance(int i) {
            // this는 자신 인스턴스를 참조할 때 사용
            this.balance = i;
        }
        public int getBalance() {
            return balance;
        }

        public void setName(String name) {
            // 생략 가능하고 주로 매개변수와 이름이 겹칠 때 구분하기 위해 사용
            this.name = name;
        }


        // 입금
        public void deposit(int amount) {
            balance += amount;
        }

        // 출금
        public void withdraw(int amount) {
            balance -= amount;
        }
    }
}


class Test {
    public static void main(String[] args) {
        // 객체 인스턴스를 생성할 때는 항상 new 키워드로 생성해줘야 한다.
        BankAccount.Bank b1 = new BankAccount.Bank();
        b1.deposit(100);

        BankAccount.Bank b2 = new BankAccount.Bank();
        b2.deposit(1000);

        b1.setBalance(1000000);;
    }
}
