package kg.itacademy.lesson34;

public abstract class House {
    private String city;
    private String street;
    private String house;
    // TODO: hoouseType enum

    public House(String city, String street, String house) {
        this.city = city;
        this.street = street;
        this.house = house;
    }
    public abstract String getAddress();
    public abstract void payHouseBills(HousePayable payer);

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
}
