/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Seoyoung Kong
 */

import java.util.Scanner;

public class Solution11 {

    public static final Scanner scan =  new Scanner(System.in);

    public static void main(String[] args){

        String euro,exchangeRate;
        converter convert = new converter();

        System.out.print("How many euros are you exchanging? ");
        euro = scan.nextLine();

        System.out.print("What is the exchange rate? ");
        exchangeRate = scan.nextLine();

        double euros = Double.parseDouble(euro);
        double exchangeRates = Double.parseDouble(exchangeRate);

        convert.setEuros(euros);
        convert.exchangeRate(exchangeRates);
        double dollars = convert.convertEurosToDollars();

        System.out.printf("%.2f euros at an exchange rate of %.4f is\n", euros,exchangeRates,dollars);
        System.out.printf("%.2f U.S. dollars.",dollars);

    }
}
