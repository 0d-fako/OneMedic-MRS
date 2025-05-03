package com.onemedic.onemedic.services;

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
}
