package com.bridglabz;

import java.util.Scanner;

public class SpringSeason {
    public static boolean isSpringSeason() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the month (1-12): ");
        int m = scan.nextInt();
        System.out.print("Enter the day (1-31): ");
        int d = scan.nextInt();
        if (m >= 3 && m <= 6) {
            if (m == 3 && d >= 20) {
                return true;
            }
            if (m == 6 && d <= 20) {
                return true;
            }
        }
        return false;
    }
}
