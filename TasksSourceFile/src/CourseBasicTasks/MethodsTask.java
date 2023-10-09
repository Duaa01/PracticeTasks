package CourseBasicTasks;

import java.util.Scanner;
public class MethodsTask {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        double planFee;
        int overAgeMin;
        double extraMinCost = 0.25;
        double tax, overAgeFee, total;

        System.out.print("Enter base cost of the plan: ");
        planFee = sc.nextDouble();

        System.out.print("Enter overage minutes: ");
        overAgeMin = sc.nextInt();

        System.out.print("\nPhone Bill Statement\n");

        overAgeFee = getOverAgeFee(overAgeMin,extraMinCost);
        tax = calculateTax(planFee,overAgeMin);
        total = planFee + overAgeFee + tax;

        System.out.println("Plan: $" + planFee);

        System.out.println("Overage: $" + overAgeFee);

        System.out.println("Tax: $" + tax);

        System.out.println("Total: $"+ total);


    }
    static double getOverAgeFee(int minutes, double cost){
         double overAge = minutes * cost;
         return overAge;

    }
    static double calculateTax(double fee, double overAge){
        double subtotal = fee + overAge;
        double tax = 0.15 * subtotal;
        return tax;

    }
}
