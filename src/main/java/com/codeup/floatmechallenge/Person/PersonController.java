package com.codeup.floatmechallenge.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @GetMapping
    public List<Person>getPerson(){
        return personService.getPerson();
    }

    @PostMapping
    public void addNewPerson(@RequestBody Person person){
        personService.addNewPerson(person);
    }

    @DeleteMapping("{personId}")
    public void deletePerson(@PathVariable("personId") Long personId){
        personService.deletePerson(personId);
    }
}
