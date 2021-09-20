/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Seoyoung Kong
 */
import java.util.Scanner;

public class Solution12 {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        Bank account = new Bank();

        System.out.print("Enter the principal: ");
        double principal = scan.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = scan.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scan.nextInt();

        account.setPrincipal(principal);
        account.setInterestRate(rate);
        account.setYears(years);
        double finalCash = account.getMoney();

        System.out.printf("After %d years at %.1f%%, the investment will be worth $%.0f", years, rate, finalCash);
    }
}
