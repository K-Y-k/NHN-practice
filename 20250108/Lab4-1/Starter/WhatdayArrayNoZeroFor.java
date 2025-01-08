import java.util.Scanner;

public class WhatdayArrayNoZeroFor {
    static int[] daysInMonth  = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String[] monthNames = {"January", "Feburary", "March", "April", "May", "June", "July", "August", "Sepetember", "October", "November", "December"};
    
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a digit between 1 and 365: ");
            int dayNum = Integer.parseInt(sc.nextLine());
            int monthNum = 0;

            if (dayNum == 0) {
                break;
            }

            /* 31 -> 1월 31일이 나와야하는데 2월 0일로 나오는 에러를 해결한 방법 */
            // 내가 푼 방식
            // for (int i = 0; i < daysInMonth.length; i++) {
            //     if (dayNum - daysInMonth[i] > 0) {
            //         monthNum++;
            //         dayNum -= daysInMonth[i];    
            //     } else {
            //         break;
            //     }
            // }

            for (int day : daysInMonth) {
                if (dayNum <= dayNum) {
                    break;
                } else {
                    monthNum++;
                    dayNum -= day;
                }
            }


            System.out.printf("%s %d\n", monthNames[monthNum], dayNum);
        }
    }
}