package com.phucdevs.solid_design_principles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

class Journal {

    private final List<String> entries = new ArrayList<>();
    private static int count = 0 ;

    public void addEntry(String text) {
        entries.add("" + (++count) + ": " + text);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
}

class Persistence {

    public void saveToFiles(
            Journal journal,
            String filename,
            boolean override
    ) throws FileNotFoundException {
        if (override || new File(filename).exists()) {
            try (PrintStream out = new PrintStream(filename)) {
                out.println(journal.toString());
            }
        }
    }

    public void load(Journal journal, String filename) {}
    public void load(Journal journal, URL url) {}
}

public class DemoSRP {

    public static void main(String[] args) throws FileNotFoundException {
        Journal journal = new Journal();
        journal.addEntry("I cried today");
        journal.addEntry("I ate a bug");
        System.out.println(journal);

        Persistence persistence = new Persistence();
        String filename = "journal.txt";
        persistence.saveToFiles(journal, filename, true);
    }
}

