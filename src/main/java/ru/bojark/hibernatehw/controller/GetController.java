package ru.bojark.hibernatehw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.bojark.hibernatehw.service.PersonSearchService;

@RestController
public class GetController {
    PersonSearchService pss;
    public GetController(PersonSearchService pss){this.pss = pss;}

    @GetMapping("/persons/by-city")
    public String getPersons(@RequestParam("city") String city){
        return pss.findPersons(city);
    }
}
