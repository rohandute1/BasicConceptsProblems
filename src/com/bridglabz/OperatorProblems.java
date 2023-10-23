package com.bridglabz;

import java.util.Scanner;

public class OperatorProblems {
    Scanner scan = new Scanner(System.in);
    public void maxMinFinder(){
        System.out.println("Please enter first number: ");
        double a = scan.nextDouble();
        System.out.println("Please enter second number: ");
        double b = scan.nextDouble();
        System.out.println("Please enter third number: ");
        double c = scan.nextDouble();

        double res1 = a + b * c;
        double res2 = c + a / b;
        double res3 = a % b + c;
        double res4 = a * b + c;
        double max = Math.max(Math.max(res1,res2),Math.max(res3,res4));
        double min = Math.min(Math.min(res1,res2),Math.min(res3,res4));
        System.out.println("Equation one result is : "+ res1);
        System.out.println("Equation one result is : "+ res2);
        System.out.println("Equation one result is : "+ res3);
        System.out.println("Equation one result is : "+ res4);
        System.out.println("Maximum result among four equation is : "+ max);
        System.out.println("Minimum result among four equation is : "+ min);
    }
    public void quadraticEquation(){

        System.out.println("Please enter values of a, b, c :");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0)
        {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Roots are Real and Unequal");
            System.out.println("Root1 :" + x1);
            System.out.println("Root2 :" + x2);
        }
        else if (discriminant == 0)
        {
            double x1 = -b / (2 * a);
            System.out.println("Roots are real and equal :" + x1);
        }
        else
        {
            double realRoots = -b / (2 * a);
            double imaginaryRoots = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Discriminant is negative so Root1 is = " + realRoots + "+" + imaginaryRoots);
            System.out.println("Discriminant is negative so Root2 is = " + realRoots + "-" + imaginaryRoots);
        }
    }
}
