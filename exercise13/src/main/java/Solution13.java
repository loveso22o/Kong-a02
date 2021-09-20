/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Seoyoung Kong
 */
import java.util.Scanner;

public class Solution13 {

    public static final Scanner scan =  new Scanner(System.in);

    public static void main (String[] args){

        Bank13 account = new Bank13();

        System.out.print("What is the principal amount? ");
        double principal = scan.nextDouble();

        System.out.print("What is the rate? ");
        double rate = scan.nextDouble();

        System.out.print("What is the number of years? ");
        int years = scan.nextInt();

        System.out.print("What is the number of times the interest iss compounded per year? ");
        int times = scan.nextInt();

        account.setPrincipal(principal);
        account.setInterestRate(rate);
        account.setYears(years);
        account.setTimes(times);
        double totalCash = account.getTotal();

        System.out.printf("$%.2f invested at %.2f%% for %d years ",principal,rate,years);
        System.out.printf("compounded %d times per year is $%.2f.",times,totalCash);
    }
}
