package com.phucdevs.creation.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonBasic2 {

    public static void main(String[] args) throws Exception {

        BasicSingleton2 singleton = BasicSingleton2.getInstance();
        singleton.setValue(111);

        String filename = "singleton.bin";
        writeToFile(singleton, filename);

        singleton.setValue(222);
        BasicSingleton2 singleton2 = readFromFile(filename);

        System.out.println(singleton == singleton2);
        System.out.println(singleton.getValue());
        System.out.println(singleton2.getValue());
    }

    static void writeToFile(BasicSingleton2 singleton,
                            String filename) throws Exception {

        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(singleton);
        }
    }

    static BasicSingleton2 readFromFile(String filename) throws Exception {

        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            return (BasicSingleton2) in.readObject();
        }
    }
}

class BasicSingleton2 implements Serializable {

    private BasicSingleton2() {}

    private static final BasicSingleton2 INSTANCE = new BasicSingleton2();

    public static BasicSingleton2 getInstance() {
        return INSTANCE;
    }

    private int value = 0;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    protected Object readResolve() {
        return INSTANCE;
    }
}