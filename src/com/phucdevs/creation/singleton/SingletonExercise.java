package com.phucdevs.creation.singleton;

import java.util.function.Supplier;

public class SingletonExercise {

    private static Object funcOriginal;

    public static boolean isSingleton(Supplier<Object> func)
    {
        if (func == null) {
            funcOriginal = func.get();
        }

        return funcOriginal == func.get();
    }
}
