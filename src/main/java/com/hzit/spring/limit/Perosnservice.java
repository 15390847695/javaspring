package com.hzit.spring.limit;

import com.hzit.spring.service.Person;
import org.springframework.stereotype.Service;

@Service
public class Perosnservice implements Person {

    @Override
    public void save() {
        System.out.println("save.............");
    }

    @Override
    public void savePerson(Person person) {
        System.out.println("savePerson.............");
    }

    @Override
    public void getPersonname(int id) {
        System.out.println("getPersonname.............");
    }

    @Override
    public void findall() {
        System.out.println("findall.............");
    }
}
