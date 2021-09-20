/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Seoyoung Kong
 */
import java.util.Scanner;

public class Solution22 {

    private int largestNumber(int[] arr){

        int max=arr[0];

        for(int i = 1;i<arr.length;i++){

            if(arr[i]>max){
                max = arr[i];
            }

        }

        return max;

    }

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        Solution22 sol = new Solution22();

        int[] num = new int[3];

        System.out.print("Enter the first number: ");
        num[0] = scan.nextInt();

        System.out.print("Enter the second number: ");
        num[1] = scan.nextInt();

        System.out.print("Enter the third number: ");
        num[2] = scan.nextInt();

        if(num[0] == num[1] || num[0] == num[2] || num[1] == num[2]){
            System.out.println("The numbers must be different!");
            System.exit(1);
        }

        System.out.printf("The largest number is %d.",sol.largestNumber(num));

    }
}
