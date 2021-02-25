package ru.pebgs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.pebgs.repository.StudentRepository;

@RestController
public class TestController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping(path = "/")
    public ResponseEntity<?> test() {
        return ResponseEntity.ok(studentRepository.findById(1L).isEmpty());
    }
}
