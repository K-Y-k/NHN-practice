import java.util.Scanner;

public class WhatdayArrayNoZeroDoWhile {
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

            // 31일 이하의 숫자일 경우 최소 한번은 실행 해야하므로 do while을 사용
            // 31 -> 1월 31일이 나와야하는데 2월 0일로 나오는 에러를 해결하기 위해 else문과 break문 사용
            do {
                if (dayNum <= 31) {     // January
                    break;
                } else {
                    monthNum++;
                    dayNum -= 31;
                }
        
                if (dayNum <= 28) {     // Feburary
                    break;
                } else {
                    monthNum++;
                    dayNum -= 28;
                }
        
                if (dayNum <= 31) {     // March
                    break;
                } else {
                    monthNum++;
                    dayNum -= 31;
                }
        
                if (dayNum <= 30) {     // April
                    break;
                } else {
                    monthNum++;
                    dayNum -= 30;
                }
        
                if (dayNum <= 31) {     // May
                    break;
                } else {
                    monthNum++;
                    dayNum -= 31;
                }
        
                if (dayNum <= 30) {     // June
                    break;
                } else {
                    monthNum++;
                    dayNum -= 30;
                }
        
                if (dayNum <= 31) {     // July
                    break;
                } else {
                    monthNum++;
                    dayNum -= 31;
                }
        
                if (dayNum <= 31) {     // August
                    break;
                } else {
                    monthNum++;
                    dayNum -= 31;
                }
        
                if (dayNum <= 30) {     // September
                    break;
                } else {
                    monthNum++;
                    dayNum -= 30;
                }
        
                if (dayNum <= 31) {     // October
                    break;
                } else {
                    monthNum++;
                    dayNum -= 31;
                }
        
                if (dayNum <= 30) {     // November
                    break;
                } else {
                    monthNum++;
                    dayNum -= 30;
                }
        
                if (dayNum <= 31) {     // December
                    break;
                } else {
                    monthNum++;
                    dayNum -= 31;
                }
            } while(false);


            System.out.printf("%s %d\n", monthNames[monthNum], dayNum);
        }
    }
}