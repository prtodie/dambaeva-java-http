package org.example.controllers;

import org.example.repo.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final StudentRepository studentRepository;

    public HomeController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/")
    public String home() {
        return "Student Store Application работает!";
    }

    @GetMapping("/test")
    public String test() {
        return "Тест пройден! Время: " + java.time.LocalDateTime.now();
    }

    @GetMapping("/students/count")
    public String getStudentCount() {
        try {
            long count = studentRepository.count();
            return "Количество студентов в базе: " + count;
        } catch (Exception e) {
            return "Ошибка при получении данных: " + e.getMessage();
        }
    }
}
