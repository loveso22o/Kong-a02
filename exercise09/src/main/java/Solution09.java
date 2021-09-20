/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Seoyoung Kong
 */
import java.util.Scanner;

public class Solution09 {
    private void calculationsPerGallon(double length, double width){
        double sqPerGallon = 350;

        double totalSq = length * width;

        final int gallons = (int)Math.ceil(totalSq/sqPerGallon);

        System.out.print("You will need to purchase " + gallons + " gallons of paint to cover " + totalSq + " square feet.");

    }
    public static void main(String[] args) {
        Solution09 sol = new Solution09();

        Scanner input =  new Scanner(System.in);

        System.out.print("What is the length? ");
        double length = input.nextDouble();

        System.out.print("What is the Width? ");
        double  width = input.nextDouble();

        sol.calculationsPerGallon(length, width);
    }
}

