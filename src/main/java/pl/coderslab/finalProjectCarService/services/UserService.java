package pl.coderslab.finalProjectCarService.services;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.coderslab.finalProjectCarService.entities.User;
import pl.coderslab.finalProjectCarService.repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public Optional<User> findById(long id){
        return userRepository.findById(id);
    }

    public User update(User user) {
        return userRepository.save(user);
    }
}
