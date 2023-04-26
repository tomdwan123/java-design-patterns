package com.phucdevs.creation.singleton;

import java.util.HashMap;

public class SingletonMutiton {

    public static void main(String[] args) {

        Printer pri = Printer.get(Subsystem.PRIMARY);
        Printer aux = Printer.get(Subsystem.AUXILIARY);
        Printer fal = Printer.get(Subsystem.FALLBACK);
        Printer fa2 = Printer.get(Subsystem.FALLBACK);
    }
}

enum Subsystem {
    PRIMARY,
    AUXILIARY,
    FALLBACK
}

class Printer {

    private static int instanceCount = 0;
    private Printer() {
        instanceCount++;
        System.out.println("A total of " +
            instanceCount + " instances created so far.");
    }

    private static HashMap<Subsystem, Printer> instances = new HashMap<>();

    public static Printer get(Subsystem ss) {
        if (instances.containsKey(ss)) {
            return instances.get(ss);
        }

        Printer instance = new Printer();
        instances.put(ss, instance);
        return instance;
    }
}
