package pl.coderslab.finalProjectCarService.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.finalProjectCarService.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
