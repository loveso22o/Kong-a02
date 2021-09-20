/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Seoyoung Kong
 */
import java.util.Scanner;

public class Solution19 {

    private double bmiCalculator(double weight,double height){

        return (weight/ (height*height)) * 703;

    }

    private void doctorCheck(double bmi){

        if(bmi<18.5){
            System.out.println("You are underweight. You should see your doctor.");
        }
        else if(bmi>25){
            System.out.println("You are overweight. You should see your doctor.");
        }
        else{
            System.out.println("You are within the ideal weight range.");
        }

    }

    public static final Scanner scan= new Scanner(System.in);

    public static void main(String[] args){

        Solution19 sol = new Solution19();

        System.out.print("Please enter your weight in pounds: ");
        String weight =  scan.nextLine();

        System.out.print("Please enter your height in inches: ");
        String height = scan.nextLine();

        try{
            Double.parseDouble(weight);
            Double.parseDouble(height);

        }catch(NumberFormatException e){
            System.out.println("Please enter numbers only!");
        }

        double poundWeight = Double.parseDouble(weight);
        double inchHeight =  Double.parseDouble(height);

        double bmi= sol.bmiCalculator(poundWeight,inchHeight);
        System.out.printf("Your BMI is %.2f\n",bmi);
        sol.doctorCheck(bmi);
    }
}
