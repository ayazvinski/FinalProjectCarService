package pl.coderslab.finalProjectCarService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/CarService/homepage","/CarService/user/add","/CarService/login").permitAll()
                        .requestMatchers("/CarService/**").hasRole("ADMIN")
                        .anyRequest().authenticated())
                        .formLogin(login -> login
                                .loginPage("/CarService/login")
                                .loginProcessingUrl("/CarService/login")
                                .defaultSuccessUrl("/CarService/homepage",true)
                                .permitAll())
                        .logout(logout -> logout
                              //  .logoutUrl("/CarService/logout")
                                .logoutSuccessUrl("/")
                                .permitAll());
        return http.build();
    }
}
