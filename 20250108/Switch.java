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
                break; // �ش�Ǵ� case���� �ڵ带 ���������� break���� ����� �Ѵ�.
            default:
                daysInMonth = 31;
        }

        System.out.println(daysInMonth);
    }
}
