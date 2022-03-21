package com.company.exercises.extend.exceptions;

public class BadNameException extends Exception{
    @Override
    public String getMessage() {
        return "Podano błędne imie";
    }
}
