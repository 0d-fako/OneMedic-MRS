package com.onemedic.onemedic.services;

import com.onemedic.onemedic.dao.PersonDao;
import com.onemedic.onemedic.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class PersonService {
    private final PersonDao personDao;

    @Autowired
    public PersonService ( @Qualifier("fakeDao") PersonDao personDao){
        this.personDao = personDao;
    }
    public int addPerson (Person person){
        return personDao.insertPerson(person);
    }

    public List<Person> getAllPersons(){
        return personDao.getAllPeople();
    }

    public Optional<Person> getPersonById(UUID id){
        return personDao.getPersonById(id);
    }

    public int deletePersonById(UUID id){
        return personDao.deletePerson(id);

    }

    public int updatePerson(UUID id, Person person){
        return personDao.updatePerson(id, person);

    }

}
