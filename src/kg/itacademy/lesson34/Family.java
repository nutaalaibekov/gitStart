package kg.itacademy.lesson34;

import java.util.HashSet;
import java.util.Set;

public class Family implements HousePayable {
    private final Set<Person> familyMembers;
    private double budged = 0;
    private House house;

    public Family(double budged, Set<Person> familyMembers, House house) {
        this.budged = budged;
        this.familyMembers = familyMembers;
        this.house = house;
    }

    @Override
    public void payForHouse(double price) {
        if (price > budged) {
            System.err.println("Not enough budget");
        } else {
            budged = budged - price;
        }
    }

    public int countMembers() {
        return familyMembers.size();
    }

    public HouseType getHouseType() {
        return house.getType();
    }

    public String getAddress() {
        return house.getAddress();
    }


}
