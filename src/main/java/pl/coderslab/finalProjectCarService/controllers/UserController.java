package pl.coderslab.finalProjectCarService.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.finalProjectCarService.repository.UserRepository;

@Controller
@RequestMapping("/CarService/User")
public class UserController {
    UserRepository userRepository;




}
