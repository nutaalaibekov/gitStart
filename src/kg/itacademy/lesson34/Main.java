package kg.itacademy.lesson34;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<Family> families = new ArrayList<>();
        Set<Person> fam1 = new HashSet<>();
        fam1.add(new Person("Katya Petrova", 33));
        fam1.add(new Person("Ivan Petrov", 36));
        fam1.add(new Person("Maxim Petrov", 10));
        families.add(new Family(30000.0, fam1, new Flat("Bishkek", "Sovetskaya", "13", 55)));

        Set<Person> fam11 = new HashSet<>();
        fam11.add(new Person("Olya Petrova", 33));
        fam11.add(new Person("Nurbek Petrov", 36));
        fam11.add(new Person("Chang Petrov", 10));
        fam11.add(new Person("Young Petrov", 10));
        families.add(new Family(30000.0, fam11, new Flat("Bishkek", "Sovetskaya", "14", 34)));

        Set<Person> fam2 = new HashSet<>();
        fam2.add(new Person("Aigerim Moldovaev", 33));
        fam2.add(new Person("Bek Moldovaev", 36));
        fam2.add(new Person("Alim Moldovaev", 10));
        fam2.add(new Person("Jenya Moldovaev", 10));
        families.add(new Family(30000.0, fam2, new Hotel("Bishkek", "Sovetskaya", "13", 55)));

        Set<Person> fam3 = new HashSet<>();
        fam3.add(new Person("Askar Moldovaev", 33));
        fam3.add(new Person("Manya Moldovaev", 36));
        fam3.add(new Person("Youra Moldovaev", 10));
        fam3.add(new Person("Loki Moldovaev", 10));
        families.add(new Family(30000.0, fam3, new Hostel("Bishkek", "Sovetskaya", "13", 55, 0)));

        int flatGuests = 0;
        int hostelGuests = 0;
        int hotelGuests = 0;

        for(Family family : families) {
            if (family.getHouseType() == HouseType.FLAT) {
                flatGuests += family.countMembers();
            } else if (family.getHouseType() == HouseType.HOSTEL) {
                hostelGuests += family.countMembers();
            } else if (family.getHouseType() == HouseType.HOTEL) {
                hotelGuests += family.countMembers();
            }

            try {
                family.getHouse().payHouseBills(family);
            } catch (Exception e) {
                System.err.println(e);
            }
        }

        System.out.println("flatGuests = " + flatGuests);
        System.out.println("hostelGuests = " + hostelGuests);
        System.out.println("hotelGuests = " + hotelGuests);
    }
}
