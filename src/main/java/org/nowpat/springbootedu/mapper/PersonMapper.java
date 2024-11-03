package org.nowpat.springbootedu.mapper;

import org.mapstruct.Mapping;
import org.nowpat.springbootedu.model.PersonDto;
import org.nowpat.springbootedu.model.PersonEntity;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    //@Mapping annotation is needed when properties name are different.
    //DefaultExpression is used to set value to target property when corresponding source property is null.

    @Mapping(source = "id", target = "identifier")
    @Mapping(source = "name", target = "surname", defaultExpression = "java(java.util.UUID.randomUUID().toString())")
    PersonDto personEntityToPersonDto(PersonEntity personEntity);
}