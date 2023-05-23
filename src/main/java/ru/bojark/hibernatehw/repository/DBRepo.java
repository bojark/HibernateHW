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

        return entityManager.createQuery(
                        "select c from Person c where c.cityOfLiving = :city_of_living order by c.surname", Person.class)
                .setParameter("city_of_living", city)
                .getResultList();
    }
}
