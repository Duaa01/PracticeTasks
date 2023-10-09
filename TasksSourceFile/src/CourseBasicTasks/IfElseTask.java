package CourseBasicTasks;

import java.util.Scanner;

public class IfElseTask {
    public static void main(String args[]){
        double change, penny = 0.01, nickel = 0.05, dime = 0.10, quarter = 0.25, diff, dollar = 1;
        double pennyInput, nicInput, dimeInput, quarterInput;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nHow many pennies would you like? ");
        pennyInput = sc.nextInt();

        System.out.print("How many nickels would you like? ");
        nicInput = sc.nextInt();

        System.out.print("How many dimes would you like? ");
        dimeInput = sc.nextInt();

        System.out.print("How many quarters would you like? ");
        quarterInput = sc.nextInt();

        change = (penny * pennyInput) + (nickel * nicInput) + (dime * dimeInput) + (quarter * quarterInput);

        if(change == dollar){
            System.out.print("\n\t\t\t Congratulations!!! You won \n");
        }
        else if(change > dollar){
            diff = change - dollar;
            System.out.print("It is more than 1$ and you went over by " + diff + " cents \n");
        }
        else if (change < dollar) {
            diff = dollar - change;
            System.out.print("It is less than 1$ and you are less by " + diff + "  \n");

        }
        else{
            System.out.print("Invalid Input");
        }


    }
}
