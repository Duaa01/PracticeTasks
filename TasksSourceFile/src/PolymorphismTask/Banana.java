package PolymorphismTask;

public class Banana extends Fruit{

    public Banana(){
        setCalories(105);
    }

    public void removePeel(){
        System.out.println("You need to remove the peel before blending");
    }

    public void makeJuice(){
        System.out.println("Please make banana juice once peel is removed");
        System.out.println("Here's you Banana Juice");
    }

}
