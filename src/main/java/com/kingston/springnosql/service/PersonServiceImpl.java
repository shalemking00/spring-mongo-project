package com.kingston.springnosql.service;

import com.kingston.springnosql.collection.Person;
import com.kingston.springnosql.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository person_repo;
    @Override
    public String savePerson(Person person) {
        return person_repo.save(person).getId();

    }
}
