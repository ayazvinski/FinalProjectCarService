package pl.coderslab.finalProjectCarService.services;

import org.springframework.stereotype.Service;
import pl.coderslab.finalProjectCarService.entities.Car;
import pl.coderslab.finalProjectCarService.repository.CarRepository;

@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
    public Car save(Car car) {
        return carRepository.save(car);
    }

}
