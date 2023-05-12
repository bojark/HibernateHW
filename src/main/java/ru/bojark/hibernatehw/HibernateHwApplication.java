package ru.bojark.hibernatehw;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class HibernateHwApplication {
    @PersistenceContext
    EntityManager entityManager;
    public static void main(String[] args) {
        SpringApplication.run(HibernateHwApplication.class, args);
    }

}
