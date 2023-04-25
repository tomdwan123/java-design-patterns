package com.phucdevs.creation.factories;

public class FactoryExercise {

    /**
     * You are given a class called Person . The person has two fields: id , and name .
     *
     * Please implement a non-static PersonFactory that has a createPerson()  method that takes a person's
     * name and returns a new instance of Person .
     *
     * The id  of the person returned should be set as a 0-based index of the object created by that
     * factory. So, the first person the factory makes should have id=0, second id=1 and so on.
     * @param args
     */
    public static void main(String[] args) {

        Person bob = new PersonFactory().createPerson("Bob");
        Person sue = new PersonFactory().createPerson("Sue");
        System.out.println(bob.id + ": " + bob.name);
        System.out.println(sue.id + ": " + sue.name);
    }
}

class Person
{
    public int id;
    public String name;

    public Person(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
}

class PersonFactory
{
    private static int index;

    public Person createPerson(String name)
    {
        return new Person(index++, name);
    }
}
