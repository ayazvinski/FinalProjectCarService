package pl.coderslab.finalProjectCarService.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import pl.coderslab.finalProjectCarService.repository.UserRepository;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.
                authorizeHttpRequests((requests) -> requests
                        .requestMatchers("/CarService/login", "/CarService/homepage").permitAll()
                        .anyRequest().authenticated())
                .formLogin((login) -> login
                        .loginPage("/CarService/login")
//                                .loginProcessingUrl("/CarService/login")
//                                .defaultSuccessUrl("/CarService/homepage",true)
                        .permitAll())
                .logout((logout) -> logout
//                                .logoutUrl("/CarService/logout")
//                                .logoutSuccessUrl("/")
                        .permitAll());
        return http.build();
    }

    @Bean
    public UserDetailsService myUserDetailService(UserRepository userRepository){
        return new MyUserDetailsService(userRepository);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
