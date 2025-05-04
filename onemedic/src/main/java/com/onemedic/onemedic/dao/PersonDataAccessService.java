package com.onemedic.onemedic.dao;

import com.onemedic.onemedic.model.Person;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Repository("postgres")
public class PersonDataAccessService implements PersonDao{
    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public List<Person> getAllPeople() {
        return List.of(new Person(UUID.randomUUID(), "Postgres"));
    }

    @Override
    public int deletePerson(UUID id) {
        return 0;
    }

    @Override
    public int updatePerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public Optional<Person> getPersonById(UUID id) {
        return Optional.empty();
    }
}
