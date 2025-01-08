import java.util.Scanner;

public class Whatday {
    static int[] daysInMonth  = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static int[] daysInLeapMonth  = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String[] monthNames = {"January", "Feburary", "March", "April", "May", "June", "July", "August", "Sepetember", "October", "November", "December"};
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a year number: ");
            String line = scanner.nextLine();
            int yearNum = Integer.parseInt(line);

            boolean isLeapYear = (yearNum % 4 == 0) && 
                                 (yearNum % 100 != 0 || yearNum % 400 == 0);

            int maxDayNum = 0;

            if (isLeapYear) {
                maxDayNum = 366;
            } else {
                maxDayNum = 365;
            }


            System.out.print("Enter a day number between 1 and " + maxDayNum + ": ");
            line = scanner.nextLine();
            int dayNum = Integer.parseInt(line);

            if (dayNum < 1 || dayNum > maxDayNum) {
                throw new IllegalArgumentException("Out of Date");
            }

            int monthNum = 0; 

            if (isLeapYear) {
                for (int days: daysInLeapMonth) {
                    if (dayNum <= days) {
                        break;
                    }
                    else {
                        dayNum -= days;
                        monthNum++;
                    }
                }
            } else {
                for (int days: daysInMonth) {
                    if (dayNum <= days) {
                        break;
                    }
                    else {
                        dayNum -= days;
                        monthNum++;
                    }
                }
            }

            String monthName = monthNames[monthNum];

            System.out.printf("%s, %d \n", monthName, dayNum);
        } 
        catch (NumberFormatException e) {
            System.out.println("Something wrong");
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // 발생한 예외 메시지 메서드
            e.printStackTrace();                // 발생한 라인을 알려주는 메서드
        }
        finally {
            scanner.close();
        }
    }
}