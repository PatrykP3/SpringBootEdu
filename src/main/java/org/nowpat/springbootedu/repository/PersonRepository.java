package org.nowpat.springbootedu.repository;

import java.util.Optional;
import org.nowpat.springbootedu.model.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonEntity, Long> {

    Optional<PersonEntity> findById(Long id);
}
