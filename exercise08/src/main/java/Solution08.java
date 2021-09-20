/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Seoyoung Kong
 */

import java.util.Scanner;

public class Solution08 {
    private void calculatePieces(int totalSlices, int people){

        int pieces = totalSlices / people;
        System.out.print("Each person gets " + pieces + " pieces of pizza.\n");
    }

    private void calculateLeftover (int people, int totalSlices){
        int leftover = totalSlices % people;
        System.out.print("There are " + leftover + " leftover pieces.");
    }

    public static void main(String[] args) {
        Solution08 sol = new Solution08();

        Scanner input = new Scanner(System.in);

        System.out.print("How many people? ");
        int people = input.nextInt();

        System.out.print("How many pizzas do you have? ");
        int pizzas = input.nextInt();

        System.out.print("How many slices per pizzas? ");
        int slices = input.nextInt();

        int totalSlices = pizzas * slices;
        System.out.print(people + " people with " + pizzas + " pizzas (" + totalSlices + " slices)\n" );

        sol.calculatePieces(totalSlices, people);

        sol.calculateLeftover(people, totalSlices);
    }
}