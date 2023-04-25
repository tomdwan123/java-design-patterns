package com.phucdevs.creation.builder;

public class BuilderFaceted {

    public static void main(String[] args) {

        Person2Builder pb = new Person2Builder();
        Person2 person2 = pb
            .lives()
                .at("123 London Road")
                .in("London")
                .postcode("SW123")
            .works()
                .at("Frarika")
                .asA("Engineer")
                .earning(123000)
                .build();
        System.out.println(person2);
    }
}

class Person2 {

    public String streetAddress, postcode, city;

    public String companyName, position;
    public int annualIncome;

    @Override
    public String toString() {
        return "Person{" +
                "streetAddress='" + streetAddress + '\'' +
                ", postcode='" + postcode + '\'' +
                ", city='" + city + '\'' +
                ", companyName='" + companyName + '\'' +
                ", position='" + position + '\'' +
                ", annualIncome=" + annualIncome +
                '}';
    }
}

class Person2Builder {

    protected Person2 person = new Person2();

    public PersonAddressBuilder lives() {
        return new PersonAddressBuilder(person);
    }

    public PersonJobBuilder works() {
        return new PersonJobBuilder(person);
    }

    public Person2 build() {
        return person;
    }
}

class PersonAddressBuilder extends Person2Builder {

    public PersonAddressBuilder(Person2 person) {
        this.person = person;
    }

    public PersonAddressBuilder at(String streetAddress) {
        person.streetAddress = streetAddress;
        return this;
    }

    public PersonAddressBuilder in(String city)
    {
        person.city = city;
        return this;
    }

    public PersonAddressBuilder postcode(String postcode) {
        person.postcode = postcode;
        return this;
    }
}


class PersonJobBuilder extends Person2Builder
{
    public PersonJobBuilder(Person2 person)
    {
        this.person = person;
    }

    public PersonJobBuilder at(String companyName)
    {
        person.companyName = companyName;
        return this;
    }

    public PersonJobBuilder asA(String position)
    {
        person.position = position;
        return this;
    }

    public PersonJobBuilder earning(int annualIncome)
    {
        person.annualIncome = annualIncome;
        return this;
    }
}
