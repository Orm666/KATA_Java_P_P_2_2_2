package web.dao;

import org.springframework.stereotype.Repository;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    private final List<Car> cars = new ArrayList<>();

    public CarDaoImp() {
        cars.add(new Car("Car1", "RED", 1));
        cars.add(new Car("Car2", "BLUE", 2));
        cars.add(new Car("Car3", "GREEN", 3));
        cars.add(new Car("Car4", "ORANGE", 4));
        cars.add(new Car("Car5", "ROSE", 5));
    }

    @Override
    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public List<Car> listCountCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
