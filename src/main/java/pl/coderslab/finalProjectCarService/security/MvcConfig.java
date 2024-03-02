package pl.coderslab.finalProjectCarService.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/CarService/homepage").setViewName("homePage");
        registry.addViewController("/login").setViewName("loginPage");
    }

}
