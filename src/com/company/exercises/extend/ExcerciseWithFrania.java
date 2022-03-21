package com.company.exercises.extend;

import com.company.exercises.extend.animals.Cat;
import com.company.exercises.extend.animals.abstracts.Animal;

public class ExcerciseWithFrania {

    public static void main(String[] args) {
        Cat frania = franiaGo();
        checkInstanceOfFrania(frania);
    }

    private static void checkInstanceOfFrania(Cat frania) {
        System.out.println(frania instanceof Cat);
        System.out.println(frania instanceof Animal);
    }

    private static Cat franiaGo() {
        Cat frania = new Cat();
        frania.giveVoice();
        frania.go();
        return frania;
    }
}
