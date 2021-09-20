/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Seoyoung Kong
 */
import java.util.Scanner;

public class Solution14 {

    private double getTaxAmount(double subtotal){

        return subtotal * WISCONSIN_TAX;
    }

    private double getTotalAmount(double subtotal){

        double cents = 100 * (subtotal + (getTaxAmount(subtotal)));
        cents = Math.ceil(cents);
        return cents/100;

    }

    private static final double WISCONSIN_TAX = .055;
    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        Solution14 sol = new Solution14();

        System.out.print("What is the order amount? ");
        double subtotal = scan.nextDouble();

        scan.nextLine();

        System.out.print("What is the state? ");
        String state = scan.nextLine();

        if(state.equals("WI")){
            double total = sol.getTotalAmount(subtotal);
            double tax = sol.getTaxAmount(subtotal);
            System.out.printf("The subtotal is $%.2f.\nThe tax is $%.2f.\nThe total is $%.2f.",subtotal,tax,total);
            System.exit(1);
        }

        System.out.printf("The total is $%.2f", subtotal);
    }
}
