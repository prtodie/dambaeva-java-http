package org.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("/")
    public String home() {
        return "Главная страница - ПРИЛОЖЕНИЕ РАБОТАЕТ!";
    }

    @GetMapping("/ping")
    public String ping() {
        return "PONG - " + java.time.LocalDateTime.now();
    }

    @GetMapping("/test")
    public String test() {
        return "ТЕСТОВАЯ СТРАНИЦА - ВСЕ ОК!";
    }
}
