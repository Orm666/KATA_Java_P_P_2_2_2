package web.controller;

import org.springframework.ui.ModelMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.service.CarService;
import web.service.CarServiceImp;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count",defaultValue = "5") int carCount, ModelMap model) {

        CarService carService = new CarServiceImp();

        model.addAttribute("cars", carService.listCountCars(carCount > 5 ? 5 : carCount));

        return "cars";
    }
}
