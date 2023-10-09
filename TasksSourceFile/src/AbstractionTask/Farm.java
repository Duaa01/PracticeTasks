package AbstractionTask;

public class Farm {
    public static void main(String args[]){

        Animal duck = new Duck();

        Duck duck1 = new Duck();
        Pig pig = new Pig();

        duck.makeSound();
        duck1.makeSound();

        pig.makeSound();

        duck.eat();
        pig.eat();
    }
}
