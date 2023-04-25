package com.phucdevs.creation.singleton;

import java.io.File;
import java.io.IOException;

public class SingletonStaticBlock {
}

class StaticBlock {

    private StaticBlock() throws IOException {
        System.out.println("Singleton is initializing");
        File.createTempFile(".", ".");
    }

    private static StaticBlock instance;

    static {
        try {
            instance = new StaticBlock();
        } catch (IOException e) {
            System.err.println("failed to create singleton");
        }
    }

    public static StaticBlock getInstance() {
        return instance;
    }
}
