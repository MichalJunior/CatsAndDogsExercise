package com.company.exercises.extend.animals;

import com.company.exercises.extend.animals.abstracts.Animal;

public class Cat extends Animal {

    public void go() {
        System.out.println("idę sobie mlył mlył");
    }

    @Override
    public void giveVoice() {
        System.out.println("mlylmlył");

    }
}

