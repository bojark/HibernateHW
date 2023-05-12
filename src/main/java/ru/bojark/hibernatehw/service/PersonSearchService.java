package ru.bojark.hibernatehw.service;

import org.springframework.stereotype.Service;
import ru.bojark.hibernatehw.entities.Person;
import ru.bojark.hibernatehw.repository.DBRepo;

import java.util.List;

@Service
public class PersonSearchService {
    DBRepo dbRepo;

    public PersonSearchService(DBRepo dbRepo) {
        this.dbRepo = dbRepo;
    }

    public String findPersons(String city) {
        List<Person> list = dbRepo.extractPersons(city);
        StringBuilder sb = new StringBuilder();
        sb.append("Persons live in the city of ")
                .append(city)
                .append(":\n");

        for (Person person : list
        ) {
            sb.append(person).append("\n");
        }
        return sb.toString();
    }
}
