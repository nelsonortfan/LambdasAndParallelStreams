package org.example;

public class YoungerThanCondition implements Condition<Person>{

    private final int age_;

    YoungerThanCondition(int age){
        age_ = age;
    }

    @Override
    public boolean Test(Person person) {
        return person.getAge() < age_;
    }
}
