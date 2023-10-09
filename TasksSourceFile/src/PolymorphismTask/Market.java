package PolymorphismTask;

public class Market {

    public static void main(String args[]){

        //Fruit fruit = new Fruit();

        Fruit apple = new Apple();

        Banana banana = new Banana();
        banana.removePeel();

        System.out.println("\nApple Calories: " + apple.getCalories());
        ((Apple) apple).makeJuice();
        cutFruit(banana);
    }

    public static void cutFruit(Fruit fruit){

        if(fruit instanceof Banana){
            System.out.println("Cut them in small pieces");
        }
        else{
            System.out.println("ERROR!!!!!!");
        }




    }
}
