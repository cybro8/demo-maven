package com.example.demo.person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CreatePerson {
    @PersistenceContext
    private EntityManager entityManager;

    public String CreateUser(String firstName, String lastName, String city){
        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setCity(city);

        entityManager.persist(person);
        return person.toString();
    }
}
