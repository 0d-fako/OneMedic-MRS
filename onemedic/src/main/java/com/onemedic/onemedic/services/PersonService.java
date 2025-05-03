package com.onemedic.onemedic.services;

import com.onemedic.onemedic.dao.PersonDao;
import com.onemedic.onemedic.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private final PersonDao personDao;

    @Autowired
    public PersonService ( @Qualifier("fakeDao") PersonDao personDao){
        this.personDao = personDao;
    }
    public void addPerson (Person person){
        personDao.insertPerson(person);
    }
}
