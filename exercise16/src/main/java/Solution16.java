/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Seoyoung Kong
 */
import java.util.Scanner;

public class Solution16 {

    private String test(int age){

        String response = (age >= 16) ? "You are old enough to legally drive.":"You are not old enough to legally drive.";
        return response;

    }

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        Solution16 sol = new Solution16();

        System.out.print("What is your age? ");
        int age = scan.nextInt();

        System.out.printf("%s",sol.test(age));
    }
}
