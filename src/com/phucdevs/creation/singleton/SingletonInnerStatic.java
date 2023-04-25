package com.phucdevs.creation.singleton;

public class SingletonInnerStatic {
}

class InnerStatic {

    private InnerStatic() {}

    private static class Impl {
        private static final InnerStatic INSTANCE = new InnerStatic();
    }

    public InnerStatic getInstance() {
        return Impl.INSTANCE;
    }
}
