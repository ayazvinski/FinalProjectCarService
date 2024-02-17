package pl.coderslab.finalProjectCarService.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.finalProjectCarService.entities.Car;
import pl.coderslab.finalProjectCarService.services.CarService;
import pl.coderslab.finalProjectCarService.services.UserService;

@Controller
@RequestMapping("/CarService")
public class CarController {
    private final CarService carService;
@Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/car/add")
    public String createCarForm(Model model) {
        model.addAttribute("car", new Car());
        return "createCar";
    }

    @PostMapping("/car/add")
    public String processCarForm(Car car) {
        carService.save(car);
        return "createCar";
    }


}
