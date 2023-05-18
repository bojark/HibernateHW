package ru.bojark.hibernatehw.entities;

import java.io.Serializable;
import java.util.Objects;

public class PersonID implements Serializable {

    private String name;
    private String surname;
    private int age;

    public PersonID(){}
    public PersonID(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonID personID = (PersonID) o;
        return age == personID.age && Objects.equals(name, personID.name) && Objects.equals(surname, personID.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
}
