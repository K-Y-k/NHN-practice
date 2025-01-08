import java.util.Scanner;

public class WhatdayArray {
    static int[] daysInMonth  = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String[] monthNames = {"January", "Feburary", "March", "April", "May", "June", "July", "August", "Sepetember", "October", "November", "December"};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a digit between 1 and 365: ");
        int dayNum = Integer.parseInt(sc.nextLine());
        int monthNum = 0;


        /* calculate Month Number and days in Month using if statement */
        if (dayNum >= 31) {     // January
            monthNum++;
            dayNum -= 31;
        }

        if (dayNum >= 28) {     // Feburary
            monthNum++;
            dayNum -= 28;
        }

        if (dayNum >= 31) {     // March
            monthNum++;
            dayNum -= 31;
        }

        if (dayNum >= 30) {     // April
            monthNum++;
            dayNum -= 30;
        }

        if (dayNum >= 31) {     // May
            monthNum++;
            dayNum -= 31;
        }

        if (dayNum >= 30) {     // June
            monthNum++;
            dayNum -= 30;
        }

        if (dayNum >= 31) {     // July
            monthNum++;
            dayNum -= 31;
        }

        if (dayNum >= 31) {     // August
            monthNum++;
            dayNum -= 31;
        }

        if (dayNum >= 30) {     // September
            monthNum++;
            dayNum -= 30;
        }

        if (dayNum >= 31) {     // October
            monthNum++;
            dayNum -= 31;
        }

        if (dayNum >= 31) {     // November
            monthNum++;
            dayNum -= 30;
        }

        if (dayNum >= 31) {     // December
            monthNum++;
            dayNum -= 31;
        }

        if (dayNum == 0) {
            dayNum = 31;
        }


        System.out.printf("%s %d", monthNames[monthNum], dayNum);
    }
}