public class Switch {
    public static void main(String[] args) {
        int monthNumber = 2;
        int daysInMonth = 0;

        switch(monthNumber) {
            case 2:
                daysInMonth = 28; 
                break;
            case 4, 6, 9, 11:
            // case 4:
            // case 6:
            // case 9:
            // case 11:
                daysInMonth = 30;
                break; // 해당되는 case까지 코드를 적용했으면 break으로 멈춰야 한다.
            default:
                daysInMonth = 31;
        }

        System.out.println(daysInMonth);
    }
}
