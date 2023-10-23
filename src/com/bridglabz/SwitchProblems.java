package com.bridglabz;

import java.util.Scanner;

public class SwitchProblems {
    Scanner scan = new Scanner(System.in);
    public void vowelOrConsonantChecker(){
        System.out.println("Please enter any character to check vowel or consonant:");
        char ch = scan.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch<='z'){
            switch(ch){
                case 'a','e','i','o','u':
                    System.out.println("Entered character is a vowel.");
                    break;
                default:
                    System.out.println("Consonant");
                    break;
            }
        }
        else{
            System.out.println("Please enter character only!");
        }

    }
    public void monthNamePrinter(){
        System.out.println("Please enter number from 1 to 12 to check which month it is!:");
        int givenNum = scan.nextInt();
        switch(givenNum){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("Please enetr 1 to 12 only!");
                break;
        }
    }
}
