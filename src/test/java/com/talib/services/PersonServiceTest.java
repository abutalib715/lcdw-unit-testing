package com.talib.services;

import com.talib.repo.PersonRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.verify;

@SpringBootTest
class PersonServiceTest {

    @Mock
    PersonRepo personRepo;

    PersonService personService;

    @BeforeEach
    void setUp() {
        System.out.println("Initializing test");
        personService = new PersonService(personRepo);
    }

    @Test
    void getAllPerson() {
        personService.getAllPerson();
        verify(personRepo).findAll();
    }
}