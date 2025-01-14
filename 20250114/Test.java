enum Day {
    /*
     * 몇 가지로 한정된 값을 갖는 데이터를
     * 열거형 상수로 선언해서 한 가지 값만을 사용하도록 하는 타입
     */
    Sunday("일요일"),
    Monday("월요일"),
    Tuesday("화요일"),
    Wednesday("수요일"),
    Thursday("목요일"),
    Friday("금요일"),
    Saterday("토요일");

    private String korDayName;

    // 생성자
    private Day(String korDayName) {
        this.korDayName = korDayName;
    }

    public String getKorDayName() {
        return this.korDayName;
    }
}

class Date {
    int year, month, day;
    Day dayOfDay;

    public void setDate(int year, int month, int day, Day dayOfDay) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.dayOfDay = dayOfDay;
    }
}

public class Test {
    public static void main(String[] args) {
        Date date1 = new Date();
        date1.setDate(2025, 1, 14, Day.Tuesday);
    
        Date date2 = new Date();
        date2.setDate(2025, 1, 21, Day.Tuesday);

        // 모든 enum 변수는 생성된 enum 객체의 위치를 가리키는 것이므로 같다.
        System.out.println(date1.dayOfDay == date2.dayOfDay);
    
        System.out.println(date2.dayOfDay.getKorDayName());
    }
}
