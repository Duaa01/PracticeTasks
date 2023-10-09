package InheritanceTask;

public class WeddingCake extends Cake {
    int tiers;

    public WeddingCake(){
        super("Strawberry");
    }
    public int getTiers() {
        return tiers;
    }
    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

}
