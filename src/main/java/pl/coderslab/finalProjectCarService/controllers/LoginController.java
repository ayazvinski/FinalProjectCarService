package pl.coderslab.finalProjectCarService.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/CarService")
public class LoginController {
    @GetMapping("/login")
    public String loginPage() {
        return "loginPage";
    }
}

