package PolymorphismTask;

public class Apple extends Fruit{

    public Apple(){
        setCalories(95.60);
    }

    public void removeSeeds(){
        System.out.println("You need to remove seeds before blending");
    }

    public void makeJuice(){
        System.out.println("Please make apple juice once seeds are removed");
        System.out.println("Here's you Apple Juice");
    }

}
