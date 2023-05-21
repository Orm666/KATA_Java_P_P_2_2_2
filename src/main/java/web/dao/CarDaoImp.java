package web.dao;

import org.springframework.stereotype.Repository;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    private final List<Car> cars = new ArrayList<>();

    @Override
    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public List<Car> listCountCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
