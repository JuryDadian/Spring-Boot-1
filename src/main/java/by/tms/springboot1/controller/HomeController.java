package by.tms.springboot1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String home(String name, Model model) {
        model.addAttribute("myName", name);
        return "index";
    }
}
