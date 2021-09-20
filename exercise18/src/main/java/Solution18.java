/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Seoyoung Kong
 */

import java.util.Scanner;

public class Solution18 {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        temperature convert = new temperature();

        System.out.print("Press C to convert from Fahrenheit to Celsius.\n");
        System.out.print("Press F to convert from Celsius to Fahrenheit.\nYour choice: ");
        String temperatureChosen = scan.nextLine();

        if(temperatureChosen.equals("C") || temperatureChosen.equals("c")){
            System.out.print("Please enter the temperature in Fahrenheit: ");
            double temperature = scan.nextDouble();
            convert.setFahrenheit(temperature);
            System.out.printf("The temperature in Celsius is %.2f",convert.convertFahrenheitToCelsius());
        }
        else if(temperatureChosen.equals("F") || temperatureChosen.equals("f")){
            System.out.print("Please enter the temperature in Celsius: ");
            double temperature = scan.nextDouble();
            convert.setCelsius(temperature);
            System.out.printf("The temperature in Fahrenheit is %.2f",convert.convertCelsiusToFahrenheit());
        }
    }
}
