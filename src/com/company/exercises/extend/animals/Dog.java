package com.company.exercises.extend.animals;

import com.company.exercises.extend.animals.abstracts.Animal;
import com.company.exercises.extend.exceptions.BadNameException;


public class Dog extends Animal {

    private String name;

    public Dog(String name) throws BadNameException {
        if (name.length() == 0) {
            throw new BadNameException();
        }
        this.name = name;
    }


    public void go() {
        System.out.println("idę sobie hau hau");
    }

    @Override
    public void giveVoice() {
        System.out.println("Hau hau");

    }
}