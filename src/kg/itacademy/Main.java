package kg.itacademy;

public class Main {
    public static void main(String[] args) {
        InternaetMarket ozon = new InternaetMarket(20, 5, 0.05, 20, "Ozon");
        InternaetMarket amazon = new InternaetMarket(35, 14, 0.15, 5, "Amazon");
        InternaetMarket alibaba = new InternaetMarket(10, 9, 0.15, 14, "Alibaba");

        Product bycicle = new Product(10001, 200, "bycicle");
        Product skate = new Product(500, 200, "skate");
        Product pizza = new Product(600, 500, "pizza");


        InternaetMarket[] internaetMarkets = new InternaetMarket[3];

        internaetMarkets[0] = ozon;
        internaetMarkets[1] = amazon;
        internaetMarkets[2] = alibaba;

        InternetMarkeApi internetMarkeApi = new InternetMarkeApi();
        internetMarkeApi.getBest(internaetMarkets, bycicle);
        internetMarkeApi.getBest(internaetMarkets, skate);
        internetMarkeApi.getBest(internaetMarkets, pizza);

    }
}
