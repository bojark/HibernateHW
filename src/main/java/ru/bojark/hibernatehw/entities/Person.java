package ru.bojark.hibernatehw.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "persons", schema = "netology")
@IdClass(PersonID.class)
public class Person {
    @Id
    private String name;
    @Id
    private String surname;
    @Id
    private int age;

    @Column(name="phone_number")
    private long phoneNumber;

    @Column(name="city_of_living")
    private String cityOfLiving;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCityOfLiving() {
        return cityOfLiving;
    }

    public void setCityOfLiving(String cityOfLiving) {
        this.cityOfLiving = cityOfLiving;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age + " " + phoneNumber +
                " " + cityOfLiving + " ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && phoneNumber == person.phoneNumber && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(cityOfLiving, person.cityOfLiving);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, phoneNumber, cityOfLiving);
    }
}
