package org.example;

import java.util.ArrayList;
import java.util.List;

public class FilterClass {

    public List<Person> getPersonsLessThan20Years(List<Person> persons){
        List<Person> result = new ArrayList<>();
        for(Person person: persons){
            if(person.getAge() < 20){
                result.add(person);
            }
        }
        return  result;
    }
}
