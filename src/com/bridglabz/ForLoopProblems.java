package com.bridglabz;

import java.util.Scanner;

public class ForLoopProblems {
    Scanner scan = new Scanner(System.in);
    public void sum(){
        System.out.println("Please enter any natural number:");
        int a = scan.nextInt();
        int sum1 = 0;
        if (a <= 0){
            System.out.println("Please enter valid natural number");
        }
        else {
            for(int i = 1; i <= a; i++){
                sum1 += i;
            }
        }
        System.out.println("sum of natural numbers :" + sum1);
    }
    public void reverse(){
        System.out.println("Please enter number which you want to reverse:");
        int b = scan.nextInt();
        int reverse = 0;
        for (;b!=0;b/=10){
            int digit = b % 10;
            reverse = reverse * 10 + digit;
        }
        System.out.println("Reversed integer : " + reverse);
    }
    public void palindromeFinder(){
        System.out.println("Please enter any number to check it is Palindrome or not?:");
        int c = scan.nextInt();
        int realNumber = c;
        int revers = 0;
        for (;c!=0;c/=10){
            int digit = c % 10;
            revers = revers * 10 + digit;
        }
        if (realNumber != revers)
        {
            System.out.println("Given number is not palindrome");
        }
        else
        {
            System.out.println("Palindrome");
        }

    }
}
