package org.nowpat.springbootedu.controller;

import org.nowpat.springbootedu.model.PersonDto;
import org.nowpat.springbootedu.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/getById")
    public ResponseEntity<PersonDto> getPersonById(Long id) {
        return ResponseEntity.ok(personService.findPersonById(id));
    }
}
