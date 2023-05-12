package ru.bojark.hibernatehw.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.bojark.hibernatehw.entities.Person;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DBRepo {
    @PersistenceContext
    EntityManager entityManager;
    public List<Person> extractPersons(String city){
        List<Person> persons = new ArrayList<>();

//        Person person = entityManager.find(Person.class, city);
//        System.out.println(person);

        return persons;
    }
}
