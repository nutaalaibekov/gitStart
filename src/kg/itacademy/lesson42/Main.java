package kg.itacademy.lesson42;

import kg.itacademy.lesson39.dao.StudentsDao;
import kg.itacademy.lesson42.dao.CityDao;
import kg.itacademy.lesson42.dao.CityDaoImpl;
import kg.itacademy.lesson42.model.City;

public class Main {
    public static void main(String[] args) {
        CityDao cityDao = new CityDaoImpl();
//        for(int i = 0; i < 15; i++) {
//            City city = new City();
//            city.setName("Name " + i + 1);
//            city.setFkMajorId(2);
//            city.setFkCountryId(1);
//            cityDao.save(city);
//        }

        System.out.println(cityDao.getAll());
        System.out.println(cityDao.getAllWithNameMoreFive());
    }
}
