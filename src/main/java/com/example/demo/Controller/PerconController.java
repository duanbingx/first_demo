package com.example.demo.Controller;

import java.util.List;

import com.example.demo.bean.Person;
import com.example.demo.dao.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/person")
public class PerconController {

    @Autowired
    PersonRepository personRepository;

    @PostMapping(path="addPerson")
    public void addPerson(@RequestBody Person person) {
        personRepository.saveAndFlush(person);
    }


    @GetMapping(path="getAllPerson")
    public List<Person> getPerson(){
        return personRepository.findAll();
    }

//    @DeleteMapping(path="deletePerson")
//    public void deletePerson(@RequestParam Long id) {
//        personRepository.deleteInBatch(id);
//    }

    @PutMapping(path="updatePerson")
    public void updatePerson(@RequestBody Person person) {
        personRepository.saveAndFlush(person);
    }

}