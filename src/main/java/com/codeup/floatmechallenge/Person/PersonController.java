package com.codeup.floatmechallenge.Person;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    private final PersonRepository personDao;

    public PersonController(PersonRepository personDao) {
        this.personDao = personDao;
    }

    //show all people
    @GetMapping
    public List<Person> getPersons() {
        return personDao.findAll();
    }

    //add a new person
    @PostMapping
    public Person addNewPerson(@RequestBody Person newPerson) {

        Optional<Person> personOptional = personDao.findPersonByName(newPerson.getName());

        if (personOptional.isPresent()) {
            throw new IllegalStateException("Person already exists");
        }
        System.out.println("Hello" + newPerson);
        return personDao.save(newPerson);
    }


    //delete a person by ID
    @DeleteMapping(path = "{personId}")
    public void deletePerson(@PathVariable("personId") Long id) {

        boolean exists = personDao.existsById(id);

        if (!exists) {
            throw new IllegalStateException("person with id " + id + " does not exist");
        }
        personDao.deleteById(id);
    }

}
