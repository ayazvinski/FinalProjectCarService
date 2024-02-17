package pl.coderslab.finalProjectCarService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.finalProjectCarService.entities.Car;

public interface CarRepository extends JpaRepository <Car, Long> {

}
