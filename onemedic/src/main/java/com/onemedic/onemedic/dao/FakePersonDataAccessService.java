package com.onemedic.onemedic.dao;

import com.onemedic.onemedic.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao {
    private static final List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person){
        DB.add(new Person(id, person.getName()));

        return 1;

    }

    @Override
    public List<Person> getAllPeople() {
        return DB;
    }

    @Override
    public int deletePerson(UUID id) {
        Optional<Person> personMaybe = getPersonById(id);
        if (personMaybe.isEmpty()){
            return 0;
        }
        DB.remove(personMaybe.get());
        return 1;
    }

    @Override
    public int updatePerson(UUID id, Person Updatedperson) {
        return getPersonById(id)
                .map(person -> {
                    int index = DB.indexOf(person);
                    if (index >= 0){
                        DB.set(index, new Person(id, person.getName()));
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }

    @Override
    public Optional<Person> getPersonById(UUID id) {
        return DB.stream()
                .filter(person -> person.getId().equals(id))
                .findFirst();
    }
}
