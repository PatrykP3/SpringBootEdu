package org.nowpat.springbootedu.service;

import org.nowpat.springbootedu.exception.PersonNotFoundException;
import org.nowpat.springbootedu.model.Person;
import org.nowpat.springbootedu.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person findPersonById(Long id) {
        return personRepository.findById(id).orElseThrow(() -> new PersonNotFoundException("Person with id %s not found.".formatted(id)));
    }
}