/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Seoyoung Kong
 */

import java.util.Scanner;

public class Solution23 {

    private void trouble(){
        String answer;

        System.out.print("Is the car silent when you turn the key? ");
        answer = scan.nextLine();

        if(answer.equals("y")){

            System.out.print("Are the battery terminals corroded? ");
            answer = scan.nextLine();

            if(answer.equals("y")){
                System.out.print("Clean terminals and try starting again.");
            }
            else if(answer.equals("n")){
                System.out.print("Replace cables and try again.");
            }
        }
        else if (answer.equals("n")){

            System.out.print("Does the car make a slicking noise? ");
            answer= scan.nextLine();

            if(answer.equals("y")){

                System.out.print("Replace the battery.");

            }
            else if(answer.equals("n")){

                System.out.print("Does the car crank up but fail to start? ");
                answer = scan.nextLine();

                if(answer.equals("y")){
                    System.out.print("Check spark plug connections.");
                }
                else if(answer.equals("n")){
                    System.out.print("Does the engineer start and then die? ");
                    answer = scan.nextLine();

                    if(answer.equals("y")){

                        System.out.print("Does your car have fuel injection? ");
                        answer = scan.nextLine();

                        if(answer.equals("y")){
                            System.out.print("Get it in for service.");
                        }
                        else if(answer.equals("n")){
                            System.out.print("Check to ensure the choke is opening and closing.");
                        }

                    }
                    else if(answer.equals("n")){
                        System.out.print("This should not be possible.");
                    }
                }
            }
        }
    }

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        Solution23 sol = new Solution23();

        sol.trouble();
    }
}
