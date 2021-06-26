package kg.itacademy.lesson34;

public class Hotel extends House {
    private int room;
    private double priceForOneNight = 2000;
    private static final int days = 1;

    public Hotel(String city, String street, String house, int room) {
        super(city, street, house, HousePayType.PAID, HouseType.HOTEL);
        this.room = room;
    }

    public Hotel(String city, String street, String house, int room, int bed, double priceForOneNight) {
        super(city, street, house, HousePayType.PAID, HouseType.HOTEL);
        this.room = room;
        this.priceForOneNight = priceForOneNight;
    }

    @Override
    public String getAddress() {
        return getCity() + " " + getStreet() + " " + getHouse() + " " + room;
    }

    @Override
    public void payHouseBills(HousePayable payer) {
        payer.payForHouse(days * priceForOneNight);
    }
}
