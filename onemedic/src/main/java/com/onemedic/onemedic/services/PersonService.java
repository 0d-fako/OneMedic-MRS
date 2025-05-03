package com.onemedic.onemedic.services;

public class PersonService {
    private final PersonDao personDao;

    public PersonService (PersonDao personDao){
        this.personDao = personDao;
    }
    public int addPerson (Person person){
        return personDao.insertPerson();
    }
}
