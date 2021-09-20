/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Seoyoung Kong
 */
package exercise06;

import java.util.Calendar;
import java.util.Scanner;

public class Solution06 {
    private void retirementCalculator(int currentAge, int retirementAge){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int yearsLeft = retirementAge - currentAge;
        int retirementYear =  currentYear + yearsLeft;

        System.out.print("You have " + yearsLeft + " years left until you can retire.\n");

        System.out.print("It's " + currentYear + ", so you can retire in " + retirementYear + ".");


    }
    public static void main(String[] args) {
        Solution06 sol = new Solution06();
        Scanner input = new Scanner(System.in);

        System.out.print("What is your current age? ");

        String currentAge = input.nextLine();

        System.out.print("At what age would you like to retire? ");
        String retirementAge = input.nextLine();

        int newCurrentAge = Integer.parseInt(currentAge);
        int newRetirementAge = Integer.parseInt(retirementAge);

        sol.retirementCalculator(newCurrentAge, newRetirementAge);
    }
}
