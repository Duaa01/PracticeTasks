package InheritanceTask;

public class BirthdayCake extends Cake{

    int candles;

    public BirthdayCake(){
        super("Chocolate");
    }
    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }

}
