package InheritanceTask;

public class TasteTester {
    public static void main (String args[]){

        Cake cake = new Cake();
        BirthdayCake birthdayCake = new BirthdayCake();
        WeddingCake weddingCake = new WeddingCake();

        birthdayCake.setPrice(150.75);
        birthdayCake.setCandles(4);

        cake.setFlavor("Vanilla");

        weddingCake.setPrice(200);
        weddingCake.setTiers(4);

        System.out.println("Cake Flavor? " + cake.getFlavor() );

        System.out.println("\n Birthday Cake" );
        System.out.println("Birthday Cake Flavor? " + birthdayCake.getFlavor() );
        System.out.println("Birthday Cake Candles? " + birthdayCake.getCandles() );
        System.out.println("Birthday Cake Price? " + birthdayCake.getPrice() );


        System.out.println("\n Wedding Cake" );
        System.out.println("Wedding Cake Flavor? " + weddingCake.getFlavor() );
        System.out.println("Wedding Cake Tiers? " + weddingCake.getTiers() );
        System.out.println("Wedding Cake Price? " + weddingCake.getPrice() );





    }
}