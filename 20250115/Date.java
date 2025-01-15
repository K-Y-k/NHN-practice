public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}

class DateTime extends Date {
    public DateTime() {
        // 부모의 생성자가 정의되어 있으면
        // 무조건 super로 부모 생성자를 호출해줘야 한다.
        super(1971, 4, 28);
    }
}

class Test4 {
    public static void main(String[] args) {
        // 생성자를 따로 정의했으므로 자동 기본 생성자가 없다.
        // Date d = new Date();
    
        DateTime datetime = new DateTime();
    }
}