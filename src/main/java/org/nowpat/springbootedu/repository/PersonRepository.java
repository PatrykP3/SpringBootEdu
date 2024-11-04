package org.nowpat.springbootedu.repository;

import java.util.Optional;
import org.nowpat.springbootedu.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

    Optional<Person> findById(Long id);
}
