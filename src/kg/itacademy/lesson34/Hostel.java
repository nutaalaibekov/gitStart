package kg.itacademy.lesson34;

public class Hostel extends House {
    private int room;
    private int bed;
    private double priceForOneNight = 200;
    private int days;

    public Hostel(String city, String street, String house, int room, int bed) {
        super(city, street, house);
        this.room = room;
        this.bed = bed;
    }

    public Hostel(String city, String street, String house, int room, int bed, double priceForOneNight) {
        super(city, street, house);
        this.room = room;
        this.bed = bed;
        this.priceForOneNight = priceForOneNight;
    }

    @Override
    public String getAddress() {
        return getCity() + " " + getStreet() + " " + getHouse() + " " + room + " " + bed;
    }

    @Override
    public void payHouseBills(HousePayable payer) {
        payer.payForHouse(days * priceForOneNight);
    }
}
