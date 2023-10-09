package CourseBasicTasks;

import java.util.Scanner;

public class BasicIOTask {
    public static void main(String arg[]) {
        int num;
        String adj, season;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an adjective: ");
        adj = sc.next();

        System.out.print("Enter a whole number: ");
        num = sc.nextInt();

        System.out.print("Enter a season of your choice: ");
        season = sc.next();

        System.out.print("On a " + adj + " " + season + " day, I drink a minimum of " + num + " cups of coffee");
    }

}

