package kg.itacademy.lesson42.dao;

import kg.itacademy.lesson42.model.City;
import kg.itacademy.lesson42.model.Country;

import java.util.List;

public interface CityDao {
    boolean save(City city);
    List<City> getAll();
    List<City> getAllWithNameMoreFive();
}
