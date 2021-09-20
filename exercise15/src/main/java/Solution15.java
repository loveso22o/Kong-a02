/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Seoyoung Kong
 */

import java.util.Scanner;

public class Solution15 {

    private void passCheck(String pass){

        if(pass.equals(password)){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don't know you.");
        }
    }

    public static final Scanner scan = new Scanner(System.in);
    public static final String password = "qrisjx@fr";

    public static void main(String[] args){

        Solution15 sol = new Solution15();

        System.out.print("What is the password? ");
        String pass = scan.nextLine();
        sol.passCheck(pass);
    }
}
