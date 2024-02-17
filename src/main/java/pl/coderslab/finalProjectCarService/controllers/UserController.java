package pl.coderslab.finalProjectCarService.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.finalProjectCarService.entities.User;
import pl.coderslab.finalProjectCarService.repository.UserRepository;
import pl.coderslab.finalProjectCarService.services.UserService;

import java.util.Optional;


@Controller
@RequestMapping("/CarService")
public class UserController {

    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/add")
    public String createUserForm(Model model) {
        model.addAttribute("user", new User());
        return "createUser";
    }

    @PostMapping("/user/add")
    public String processUserForm(User user) {
        userService.save(user);
        return "createUser";
    }

    @GetMapping("/user/edit/{id}")
    public String showEditForm(@PathVariable long id, Model model) {
        Optional<User> user = userService.findById(id);
        if (user.isPresent()) {
            model.addAttribute("user", user);
            return "updateUser";
        } else {
            return "redirect:/CarService/user/add";
        }
    }

    @PostMapping("/user/edit/{id}")
    public String updateUser(User user) {
        userService.update(user);
        return "redirect:/CarService/user/add";
    }

}

