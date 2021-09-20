/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Seoyoung Kong
 */
import java.util.Scanner;

public class Solution07 {
    private void calculations(double length, double width){
        double area = length * width;
        System.out.print(area + " square feet\n");

        final double Conversion = area * 0.09290304;

        System.out.printf("%.3f square meters ", Conversion);

    }
    public static void main(String[] args) {
        Solution07 sol = new Solution07();

        Scanner input = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        double length = input.nextDouble();

        System.out.print("What is the width of the room in feet? ");
        double width = input.nextDouble();

        System.out.print("You entered dimensions of " + length + " feet by " + width + " feet.\n");
        System.out.print("The area is \n");

        sol.calculations(length, width);
    }
}