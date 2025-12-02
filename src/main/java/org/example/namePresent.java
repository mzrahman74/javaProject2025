package org.example;

import java.util.HashSet;

public class namePresent {
    public static boolean isNamePresent(HashSet<String> names, String name) {
        return names.contains(name);
    }
}