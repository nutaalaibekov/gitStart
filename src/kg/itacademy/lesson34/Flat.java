package kg.itacademy.lesson34;

public class Flat extends House {
    private int flatNumber;
    private double priceForUtilities = 1000;

    public Flat(String city, String street, String house, int flatNumber) {
        super(city, street, house, HousePayType.PAID, HouseType.FLAT);
        this.flatNumber = flatNumber;
    }

    @Override
    public String getAddress() {
        return getCity() + " " + getStreet() + " " + getHouse() + " " + flatNumber;
    }

    @Override
    public void payHouseBills(HousePayable payer) {
        payer.payForHouse(priceForUtilities);
    }
}
