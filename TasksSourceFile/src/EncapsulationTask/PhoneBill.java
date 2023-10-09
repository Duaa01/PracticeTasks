package EncapsulationTask;

public class PhoneBill {
    int id;
    double allotedMin, usedMin, baseCost;

    public static void main(String args[]){

        System.out.println("PHONE BILL\n");

        PhoneBill obj = new PhoneBill();
        obj.setId(123);
        obj.setBaseCost(345);
        obj.setUsedMin(120);
        obj.setAllotedMin(100);
        obj.printBill();

    }
    PhoneBill(){
        id = 0;
        allotedMin = 0.0;
        usedMin = 0.0;
        baseCost = 0.0;
    }
    PhoneBill(int id){
        this.id = id;
        allotedMin = 0.0;
        usedMin = 0.0;
        baseCost = 0.0;
    }
    PhoneBill(int id, double baseCost, double allotedMin, double usedMin){
        this.id = id;
        this.allotedMin = allotedMin;
        this.baseCost = baseCost;
        this.usedMin = usedMin;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getBaseCost(){
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public double getAllotedMin() {
        return allotedMin;
    }

    public void setAllotedMin(double allotedMin) {
        this.allotedMin = allotedMin;
    }

    public double getUsedMin() {
        return usedMin;
    }

    public void setUsedMin(double usedMin) {
        this.usedMin = usedMin;
    }

    public double calculateOverAge(){

        double overAgeMin;
        double extraMinCost = 0.25;
        double overAgeFee = 0;

        if (usedMin > allotedMin){
            overAgeMin = usedMin - allotedMin;
            overAgeFee = overAgeMin * extraMinCost;
        }
        else{
            System.out.print("Good Job, You didn't exceed the minutes limit :)");
        }

        double overAge = overAgeFee;
        return overAge;

    }
    public double calculateTax(){
         double rate = 0.15;
         double subTotal = (baseCost + calculateOverAge());
         double tax = rate * subTotal;
         return tax;
    }
    public double calculateTotal(){

        double total = baseCost + calculateOverAge() + calculateTax();
        return total;

    }
    public void printBill(){
        System.out.println("ID: " + id);
        System.out.println("Base Cost: " + baseCost);
        System.out.println("Alloted Minutes: " + allotedMin);
        System.out.println("Used Minutes: " + usedMin);
        System.out.println("Extra Minutes Cost: " + calculateOverAge());
        System.out.println("Tax: " + calculateTax());
        System.out.println("Total: " + calculateTotal());
    }
}
