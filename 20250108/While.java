public class While {
    public static void main(String[] args) {
        // 9x9단 프로그램
        int tableNumber = 2;
        int number = 1;

        while (tableNumber <= 9) {
            while (number <= 9) {
                System.out.printf("%d x %d = %d\n", tableNumber, number, tableNumber * number);
                number++;
            }
            
            number = 1;
            tableNumber++;
            System.out.println();
        }
    }
}
