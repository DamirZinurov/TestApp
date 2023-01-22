package org.example.validator;

public class IOValidator {
    public void checkInputValue(String inputString) {
        if ("Exit".equalsIgnoreCase(inputString)) System.exit(0);
    }
}
