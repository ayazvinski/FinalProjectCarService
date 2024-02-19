package pl.coderslab.finalProjectCarService.security;

import lombok.RequiredArgsConstructor;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import pl.coderslab.finalProjectCarService.entities.User;
import pl.coderslab.finalProjectCarService.repository.UserRepository;

import java.util.Optional;


@RequiredArgsConstructor
public class MyUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> byEmail = userRepository.findByEmail(username);

        return byEmail.map(MyUserDetails::new)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}

