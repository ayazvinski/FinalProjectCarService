package pl.coderslab.finalProjectCarService.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.finalProjectCarService.entities.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String username);
}
