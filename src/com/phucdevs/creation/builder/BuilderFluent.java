package com.phucdevs.creation.builder;

public class BuilderFluent {

    public static void main(String[] args) {

        EmployeeBuilder eb = new EmployeeBuilder();
        Person person = eb
                .withName("Dmi")
                .worksAt("USA")
                .build();
        System.out.println(person);
    }
}

class Person {

    public String name;
    public String position;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}

class PersonBuilder<T extends PersonBuilder<T>> {

    protected Person person = new Person();

    public T withName(String name) {
        person.name = name;
        return self();
    }

    public Person build() {
        return person;
    }

    protected T self() {
        return (T) this;
    }
}

class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {
    public EmployeeBuilder worksAt(String position) {
        person.position = position;
        return self();
    }

    @Override
    protected EmployeeBuilder self() {
        return this;
    }
}