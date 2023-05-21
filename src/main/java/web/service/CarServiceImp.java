package web.service;

import org.springframework.stereotype.Service;

import web.model.Car;
import web.dao.CarDao;
import web.dao.CarDaoImp;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private final CarDao carDao = new CarDaoImp();

    @Override
    public void add(Car car) {
        carDao.add(car);
    }

    @Override
    public List<Car> listCountCars(int count) {
        return carDao.listCountCars(count);
    }
}
