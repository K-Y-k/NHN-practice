public class For {
    public static void main(String[] args) {
        // for¹®
        for (int tableNumber = 2; tableNumber <= 9; tableNumber++) {
            for (int number = 1; number <= 9; number++) {
                System.out.printf("%d x %d = %d\n", tableNumber, number, tableNumber * number);
            }
            
            System.out.println();
        }


        // foreach¹®
        int[] tableNumber = {2,3,4,5,6,7,8,9,10};
        int[] number = {1,2,3,4,5,6,7,8,9,10};
        
        for (int i : tableNumber) {
            for (int j : number) {
                System.out.printf("%d x %d = %d\n", i, j, i* j);
            }
            System.out.println();
        }
    }
}
