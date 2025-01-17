package com.talib.repo;


import com.talib.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonRepo extends JpaRepository<Person, Integer> {

    @Query("SELECT CASE WHEN COUNT(p) > 0 THEN TRUE ELSE FALSE END FROM Person p WHERE p.id=?1")
    Boolean isPersonExistById(Integer id);

}
