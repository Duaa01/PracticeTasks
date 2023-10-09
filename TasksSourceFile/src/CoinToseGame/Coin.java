package CoinToseGame;
import java.util.Random;

public class Coin {
    String side;
    static final String HEADS = "Head";
    static final String TAILS = "Tail";

    public Coin(){
        side = HEADS;
    }
    public String getSide() {
        return side;
    }
//    public void setSide(String side) {
//        this.side = side;
//    }

    public void flip(){
        Random random = new Random();

        int num = random.nextInt(2);
        if(num == 0){
            side = HEADS;

        }
        else {
            side = TAILS;
        }

    }

}
