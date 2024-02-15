package pl.coderslab.finalProjectCarService.services;

import org.springframework.stereotype.Service;
import pl.coderslab.finalProjectCarService.entities.User;
import pl.coderslab.finalProjectCarService.repository.UserRepository;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User save(User user) {
        return userRepository.save(user);
    }
}
