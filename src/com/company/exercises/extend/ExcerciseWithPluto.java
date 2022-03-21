package com.company.exercises.extend;

import com.company.exercises.extend.animals.Dog;
import com.company.exercises.extend.exceptions.BadNameException;

public class ExcerciseWithPluto {

    public static void main(String[] args) {
        try {
            voiceOfPluto();
        } catch (Exception e) {
            System.out.println("inny błąd");
        }
    }

    private static void voiceOfPluto() throws BadNameException {
        Dog pluto = new Dog("Pluto");
        pluto.giveVoice();
    }
}
