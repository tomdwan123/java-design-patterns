package com.phucdevs.creation.singleton;

public class SingletonMonostate {

    public static void main(String[] args) {

        ChiefExecutiveOfficer ceo = new ChiefExecutiveOfficer();
        ceo.setName("Adam Mith");
        ceo.setAge(50);

        ChiefExecutiveOfficer ceo2 = new ChiefExecutiveOfficer();
        System.out.println(ceo2);
    }
}

class ChiefExecutiveOfficer {

    private static String name;
    private static int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        ChiefExecutiveOfficer.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        ChiefExecutiveOfficer.age = age;
    }

    @Override
    public String toString() {
        return "ChiefExecutiveOfficer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
