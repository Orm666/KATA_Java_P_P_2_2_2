package web.controller;

import org.springframework.ui.ModelMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count",defaultValue = "5") int carCount, ModelMap model) {

        CarService carService = new CarServiceImp();

        carService.add(new Car("Car1", "RED", 1));
        carService.add(new Car("Car2", "BLUE", 2));
        carService.add(new Car("Car3", "GREEN", 3));
        carService.add(new Car("Car4", "ORANGE", 4));
        carService.add(new Car("Car5", "ROSE", 5));

        model.addAttribute("cars", carService.listCountCars(carCount > 5 ? 5 : carCount));

        return "cars";
    }
}
