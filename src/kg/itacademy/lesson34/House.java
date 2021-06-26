package kg.itacademy.lesson34;

public abstract class House {
    private String city;
    private String street;
    private String house;
    private HousePayType payType;
    private HouseType type;

    public House(String city, String street, String house, HousePayType payType, HouseType type) {
        this.city = city;
        this.street = street;
        this.house = house;
        this.payType = payType;
        this.type = type;
    }
    public abstract String getAddress();
    public void payHouseBills(HousePayable payer) throws Exception {
        if (payType == HousePayType.FREE_FOR_AID || payType == HousePayType.FREE_FOR_MILITARY) {
            return;
        } else {
            throw new Exception("You should implement method payHouseBills");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public HousePayType getPayType() {
        return payType;
    }

    public HouseType getType() {
        return type;
    }
}
