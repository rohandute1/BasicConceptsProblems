package com.bridglabz;

import java.util.Scanner;

public class WhileLoopProblems
{
    Scanner scan = new Scanner(System.in);
    public void naturalNumberSum(){
        System.out.println("Please enter any Natural number:");
        int naturalNum = scan.nextInt();
        int sum = 0;
        if (naturalNum <= 0){
            System.out.println("Please enter valid natural number.");
        }
        else {
            int i = 1;
            while (i <= naturalNum) {
                sum += i;
                i++;
            }
            System.out.println("Sum of the first" + naturalNum
                    + "Natural Numbers is: " + sum);
        }
    }
    public void numberReversal(){
        System.out.println("Please enter number which you want to reverse:");
        int n = scan.nextInt();
        int reversed = 0;
        while(n!=0){
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n/=10;
        }
        System.out.println("Reversed integer : " + reversed);
    }
}
