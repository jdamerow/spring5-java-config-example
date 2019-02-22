package edu.asu.diging.spring5.example.web;

import java.time.OffsetDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.asu.diging.spring5.example.core.data.CatRepository;
import edu.asu.diging.spring5.example.core.model.Cat;

@Controller
public class HomeController {
    
    @Autowired
    private CatRepository repo;
    
    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("cats", repo.findAll());
        return "home";
    }
    
    @RequestMapping("/date")
    public String date(Model model) {
        model.addAttribute("date", OffsetDateTime.now());
        return "home";
    }
    
    @RequestMapping("/cat")
    public String cat(Model model) {
        Cat cat = new Cat();
        cat.setName("Kitty " + OffsetDateTime.now().getSecond());
        cat.setBreed("DSH");
        repo.save(cat);
        return "redirect:/";
    }
    
}
