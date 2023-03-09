package com.example.demo;

import com.example.demo.person.CreatePerson;
import com.example.demo.person.GetPerson;
import com.example.demo.person.Person;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HellowWorldController {
    @Autowired
    private CreatePerson createPerson;
    @Autowired
    private GetPerson getPerson;

    @RequestMapping(method = RequestMethod.POST, path = "/createPerson")
    public String helloWorld(@PathParam("firstname") String firstname, @PathParam("lastname") String lastname, @PathParam("city") String city){
        return createPerson.CreateUser(firstname,lastname,city);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/findPerson")
    public Optional<Person> findPerson(@PathParam("uid") Integer uid){
        return getPerson.findById(uid);
    }
}
