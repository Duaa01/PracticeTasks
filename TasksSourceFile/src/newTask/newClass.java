package newTask;

import java.util.Scanner;

public class newClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;

        System.out.print("Your name? ");
        name = scanner.next();

        System.out.println("Your name: " + name);
    }
}
