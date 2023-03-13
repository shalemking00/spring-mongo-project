package com.kingston.springnosql.service;

import com.kingston.springnosql.collection.Person;
import org.springframework.stereotype.Service;

@Service
public interface PersonService {
    public String savePerson(Person person);
}
