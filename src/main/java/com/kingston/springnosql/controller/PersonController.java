package com.kingston.springnosql.controller;

import com.kingston.springnosql.collection.Person;
import com.kingston.springnosql.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping("/add")
    public String save(@RequestBody Person person){
        return personService.savePerson(person);
    }

}
