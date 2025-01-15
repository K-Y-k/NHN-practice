public class Creator {
    private int year;
    private int month;
    private int day;

    // 기본 생성자
    // 클래스에 생성자 정의가 없으면 이 기본 생성자가 자동으로 적용된다.
    // public Creator() {
    // }

    // 생성자 오버로딩
    // 생성자를 이렇게 따로 정의 했으면 기본 생성자는 자동 정의 되지 않는다.
    public Creator() {
        // 아래 정의한 생성자 활용 방식
        this(1971, 4, 28); 
    }

    public Creator(int year) {
        this.year = year;
    }

    public Creator(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "year:" + year + " month:" + month + " day:" + day;
    }
}

class Test5 {
    public static void main(String[] args) {
        Creator c1 = new Creator();
        Creator c2 = new Creator(1982);
        Creator c3 = new Creator(1993, 10, 2);
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}