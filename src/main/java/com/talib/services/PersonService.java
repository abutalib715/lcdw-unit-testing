package com.talib.services;

import com.talib.entity.Person;
import com.talib.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepo personRepo;

    public List<Person> getAllPerson(){
        return personRepo.findAll();
    }
}
