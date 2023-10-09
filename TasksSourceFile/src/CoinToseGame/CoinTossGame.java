package CoinToseGame;

import java.util.Scanner;

public class CoinTossGame {

    public static  void main(String args[]){

        System.out.print("COIN TOSS GAME");

        Player player1 = new Player("Robby");
        Player player2 = new Player("Lisa");
        Coin coin = new Coin();

        System.out.println("\nPlayer 1 Name: " + player1.getName());
        System.out.println("Player 2 Name: " + player2.getName());

        CoinTossGame game = new CoinTossGame();
        game.makeAGuess(player2);
        //game.flip();
        game.determineWinner(player1,player2,coin);

    }
    String input; boolean valid = false;
    Scanner sc = new Scanner(System.in);
    public void makeAGuess(Player player) {
        //String player1Guess, player2Guess;
        System.out.println("Please make your guess: ");
        player.setGuess(sc.nextLine());
        System.out.println("You entered: " + player.getGuess());
        //input = player1Guess;

        if (player.getGuess().equalsIgnoreCase(Coin.HEADS) || player.getGuess().equalsIgnoreCase(Coin.TAILS)) {
            //valid = true;
            System.out.println("Your answer " + player.getGuess() + " is valid");
            flip();
        }
        else {
            valid = false;
            System.out.println("Your answer is invalid, try again");
            sc.close();
        }
    }
    public void flip(){

        Coin coin = new Coin();
        coin.flip();
        System.out.println("Your side is: " + coin.getSide());
    }

    public void determineWinner(Player player1, Player player2, Coin coin){
        automateVal(player1,player2);
        if(coin.getSide().equalsIgnoreCase(player1.getGuess())){
            System.out.println(player1.getName() + " wins");
        }
        else{
            System.out.println(player2.getName() + " wins");
        }

    }
    public void automateVal(Player player1, Player player2){
        if (player1.getGuess() != null && player1.getGuess().equalsIgnoreCase(Coin.HEADS)){
            player2.getGuess().equalsIgnoreCase(Coin.TAILS);
        }
        else{
            player2.getGuess().equalsIgnoreCase(Coin.HEADS);
        }

    }

}






