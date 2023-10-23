package com.bridglabz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!");
        System.out.println("Please select any one program: ");
        System.out.println("1.Read a single Digit Number and write in word\n" +
                "2.Read a Number 1,10,100,1000 and display unit, ten hundred\n" +
                "3.Program for the sum of n natural numbers(while loop)\n" +
                "4.Program to reverse the integer number(while loop)\n" +
                "5.Program for the sum of n natural numbers(For Loop)\n" +
                "6.Program to reverse the integer number(For Loop)\n" +
                "7.Program to find Palindrome Number(For Loop)\n" +
                "8.Program to Check Vowel or Consonant\n" +
                "9.Program to print the month name for the given number\n" +
                "10.find max and min.\n" +
                "11.Quadratic equation problem.\n" +
                "12.Problem on Quadratic equation\n" +
                "13.Spring season Program.");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();

        switch(option)
        {
            case 1:
                If_Else_Statement_Problems prob = new If_Else_Statement_Problems();
                prob.numberToWordConverter();
                break;
            case 2:
                If_Else_Statement_Problems prob1 = new If_Else_Statement_Problems();
                prob1.numberUnitToWord();
                break;
            case 3:
                WhileLoopProblems prob2 = new WhileLoopProblems();
                prob2.naturalNumberSum();
                break;
            case 4:
                WhileLoopProblems prob3 = new WhileLoopProblems();
                prob3.numberReversal();
                break;
            case 5:
                ForLoopProblems prob4 = new ForLoopProblems();
                prob4.sum();
                break;
            case 6:
                ForLoopProblems prob5 = new ForLoopProblems();
                prob5.reverse();
                break;
            case 7:
                ForLoopProblems prob6 = new ForLoopProblems();
                prob6.palindromeFinder();
                break;
            case 8:
                SwitchProblems prob7 = new SwitchProblems();
                prob7.vowelOrConsonantChecker();
                break;
            case 9:
                SwitchProblems prob8 = new SwitchProblems();
                prob8.monthNamePrinter();
                break;
            case 10:
                OperatorProblems prob9 = new OperatorProblems();
                prob9.maxMinFinder();
                break;
            case 11:
                QuadraticEquation equation = new QuadraticEquation();
                equation.Quadratic();
                break;
            case 12:
                OperatorProblems prob10 = new OperatorProblems();
                prob10.quadraticEquation();
                break;
            case 13:
                boolean isSpring = SpringSeason.isSpringSeason();
                System.out.println(isSpring);
                break;

        }

    }
}