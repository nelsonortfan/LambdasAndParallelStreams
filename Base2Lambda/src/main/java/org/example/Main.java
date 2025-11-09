package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Init the data with Persons for the List
        Person person1 = new Person("Ortiz", "Nelson", Gender.MASCULIN, 37, false);
        Person person2 = new Person("Ortiz", "Valentina", Gender.FEMENIN, 16, false);
        Person person3 = new Person("Suarez", "Luis", Gender.MASCULIN, 42, false);
        Person person4 = new Person("Alvarado", "Paola", Gender.FEMENIN, 23, true);
        Person person5 = new Person("Muñoz", "Daniela", Gender.FEMENIN, 17, true);
        Person person6 = new Person("Cruz", "Milena", Gender.FEMENIN, 34, false);

        // add the persons to the list
        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);

        // using Lambda Expression:

        List<Person> personByFilter = new ArrayList<>();
        personByFilter = personList
                .stream()  // use the stream
                .filter(p -> p.getAge() < 20)  // apply the filter
                .collect(Collectors.toList()); // collect the result

        System.out.println("Using the filter, the result is: ");
        for(Person personfilter: personByFilter){
            System.out.println( "The details of the person is " + personfilter);
        }

    }
}