package org.nowapat.springbootedu.controller;

import org.nowapat.springbootedu.model.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @GetMapping("/getById")
    public ResponseEntity<Person> getPersonById(Long id) {
        return ResponseEntity.ok(new Person(1L, "first"));
    }
}
