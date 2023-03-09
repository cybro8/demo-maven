package com.example.demo.person;

import jakarta.persistence.*;

@Entity
@Table(name = "persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PersonID")
    private Integer PersonID;
    @Column(name = "Firstname")
    private String FirstName;
    @Column(name = "Lastname")
    private String LastName;
    @Column(name = "City")
    private String City;

    protected Person(){
    }

    @Override
    public String toString() {
        return "Person{" +
                "PersonID=" + PersonID +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", City='" + City + '\'' +
                '}';
    }

    public Integer getPersonID() {
        return PersonID;
    }

    public void setPersonID(Integer personID) {
        PersonID = personID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}

