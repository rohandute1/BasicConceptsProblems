package com.bridglabz;

import java.util.Scanner;

public class If_Else_Statement_Problems {
    Scanner obj = new Scanner(System.in);
    public void numberToWordConverter(){
        System.out.println("Please enter single digit integer:");


        int number = obj.nextInt();
        if (number == 0){
            System.out.println("ZERO");
        }
        else if (number == 1){
            System.out.println("ONE");
        }
        else if (number == 2){
            System.out.println("TWO");
        }
        else if (number == 3){
            System.out.println("THREE");
        }
        else if (number == 4){
            System.out.println("FOUR");
        }
        else if (number == 5){
            System.out.println("FIVE");
        }
        else if (number == 6){
            System.out.println("SIX");
        }
        else if (number == 7){
            System.out.println("SEVEN");
        }
        else if (number == 8){
            System.out.println("EIGHT");
        }
        else if (number == 9){
            System.out.println("NINE");
        }
        else if (number >= 10) {
            System.out.println("Please enter valid number");
        }
    }
    public void numberUnitToWord(){
        System.out.println("Please enter following numbers to display unit :-\n1,10,100,1000,10000");
        int num = obj.nextInt();
        if (num == 1){
            System.out.println("UNIT");
        }
        else if (num == 10){
            System.out.println("TEN");
        }
        else if (num == 100){
            System.out.println("HUNDRED");
        }
        else if (num == 1000){
            System.out.println("THOUSAND");
        }
        else if (num == 10000){
            System.out.println("TEN THOUSAND");
        }
        else {
            System.out.println("Please enter valid number.");
        }
    }


}
