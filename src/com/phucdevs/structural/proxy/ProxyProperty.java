package com.phucdevs.structural.proxy;

import java.util.Objects;

public class ProxyProperty {

    public static void main(String[] args) {
        Creature creature = new Creature();
        creature.setAgility(12);
    }
}

class Creature {

    private Property<Integer> agility = new Property<>(10);

    public int getAgility() {
        return agility.getValue();
    }

    public void setAgility(int value) {
        agility.setValue(value);
    }
}

class Property<T> {

    private T value;

    public Property(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Property<?> property = (Property<?>) obj;
        return Objects.equals(value, property.value);
    }
}


