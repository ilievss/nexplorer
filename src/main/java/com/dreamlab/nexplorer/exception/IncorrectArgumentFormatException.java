package com.dreamlab.nexplorer.exception;

public class IncorrectArgumentFormatException extends RuntimeException {

    public IncorrectArgumentFormatException(String functionName, int argumentPosition, String argument) {
        super(String.format("Incorrect format for argument '%s' at position %d for function call to '%s'",
                argument, argumentPosition, functionName));
    }
}
