package com.onemedic.onemedic.dao;

import com.onemedic.onemedic.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person) {

        UUID id = UUID.randomUUID();
        return insertPerson(id, person);

    }


    List<Person> getAllPeople();

    int deletePerson(UUID id);

    int updatePerson(UUID id, Person person);

    Optional<Person> getPersonById(UUID id);

}
