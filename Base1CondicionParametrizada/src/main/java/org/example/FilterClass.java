package org.example;

import java.util.ArrayList;
import java.util.List;

public class FilterClass {

    public List<Person> getPersonsLessThan20Years(List<Person> persons, Condition<Person> condition){
        List<Person> result = new ArrayList<>();
        for(Person person: persons){
            if(condition.Test(person)){
                result.add(person);
            }
        }
        return  result;
    }
}
