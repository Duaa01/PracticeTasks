package CourseBasicTasks;

import java.util.Scanner;

public class ArrayTask {

    public static void main(String args[]){

        String days[] ={
          "Monday",
          "Tuesday",
          "Wednesday",
          "Thursday",
          "Friday",
          "Saturday",
          "Sunday"
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number: ");
        int input = sc.nextInt();

        String day = days[input - 1];

        System.out.println("Day: " + day);

        }

}


