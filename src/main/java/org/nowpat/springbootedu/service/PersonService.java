package org.nowpat.springbootedu.service;

import org.nowpat.springbootedu.exception.PersonNotFoundException;
import org.nowpat.springbootedu.mapper.PersonMapper;
import org.nowpat.springbootedu.model.PersonDto;
import org.nowpat.springbootedu.model.PersonEntity;
import org.nowpat.springbootedu.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    PersonMapper personMapper;

    public PersonDto findPersonById(Long id) {

        PersonEntity personEntity = personRepository.findById(id).orElseThrow(() -> new PersonNotFoundException("PersonEntity with id %s not found.".formatted(id)));
        PersonDto personDto = personMapper.personEntityToPersonDto(personEntity);
        return personDto;
    }
}
