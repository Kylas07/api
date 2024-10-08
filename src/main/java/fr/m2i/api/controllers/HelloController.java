package fr.m2i.api.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {

    @GetMapping("/hello")
    public String getHello() {
        return "Hello World";
    }
    
    @GetMapping("/")
    public String getHome() {
        return "Home Page";
    }

}