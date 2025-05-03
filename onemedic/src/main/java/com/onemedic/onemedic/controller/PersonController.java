package com.onemedic.onemedic.controller;


@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }


    @PostMapping
    public void addPerson(Person person) {
        personService.addPerson(person);
    }
}
