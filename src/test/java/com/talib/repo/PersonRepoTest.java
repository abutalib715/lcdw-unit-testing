package com.talib.repo;

import com.talib.entity.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class PersonRepoTest {

    @Autowired
    PersonRepo personRepo;

    @BeforeEach
    void setUp() {
        personRepo.deleteAll(); // Clean up before each test
        System.out.println("Before each test");
    }

    @Test
    void isPersonExistById() {
        Person person = new Person(123, "Kabir", "Dhaka");
        personRepo.save(person);

        Boolean actualResult = personRepo.isPersonExistById(123);

        assertThat(actualResult).isTrue();
    }

    @AfterEach
    void tearDown() {
        personRepo.deleteAll(); // Clean up after each test
        System.out.println("After each test");
    }
}