/*(Pattern recognition: consecutive four equal numbers) Write the following
method that tests whether the array has four consecutive numbers with the same
value.
public static boolean isConsecutiveFour(int[] values)
Write a test program that prompts the user to enter a series of integers and displays
if the series contains four consecutive numbers with the same value. Your
program should first prompt the user to enter the input size—i.e., the number of
values in the series.

@Author: Ryan Pletzer
@Class : Csc201
@Assignment Chapter 7 - Question 30

All rights reserved
*/
import java.util.Scanner;

public class PletzerC7Q30 {
    public static void main(String[] args) {
        int input [] =welcome();
        if (isConsecutiveFour(input) == true) {
            System.out.println("The list has consecutive fours ");
        }
        else System.out.println("The list has no consecutive fours");


    }

    // welcome statement that returns the input array
    public static int [] welcome(){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("welcome to the pattern recognition program");
        System.out.println("please enter a list size now:");
        int size = keyboard.nextInt();

        System.out.println("please enter your list of values now:");
        int [] input = new int[size];
        for (int index = 0; index < input.length; index++) {
            input[index] = keyboard.nextInt();}

        return input ;
    }
    public static boolean isConsecutiveFour(int[] input){
        int counter = 0;
        int valueHold =0;
        // first loop is the value holder for the i position in the array
            for (int i =0; i < input.length; i++) {
                valueHold = input[i];
                // second loop compares each line point against one another.
                for (int j = 0; j < input.length; j++) {
                    if (valueHold == input [j]){
                        counter += +1;}
                    if (counter == 4) return true;
                    else if(valueHold != input [j]) counter =0;
                }
            }
        //if (counter ==4) return true; // probably redundant
        return false;
    }


}
