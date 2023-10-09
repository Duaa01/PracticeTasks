package InheritanceTask;

public class Cake {
    String flavor;
    double price;
    public Cake(){
        flavor = "";
        price = 0.0;
    }
    public Cake(String flavor)
    {
        this.flavor = flavor;
    }
    public String getFlavor() {
        return flavor;
    }
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
