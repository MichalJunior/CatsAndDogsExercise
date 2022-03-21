package com.company.exercises.extend;


import com.company.exercises.extend.animals.Cat;
import com.company.exercises.extend.animals.Dog;
import com.company.exercises.extend.animals.abstracts.Animal;

public class ExerciseWithSmallDog {

    public static void main(String[] args) {
        try {
            Animal smallDog = new Dog("piesek");
            checkInstanceOfSmallDog(smallDog);
            ((Cat) smallDog).go();
        } catch (ClassCastException e) {
            System.out.println("Coś poszło nie tak " + e.getMessage());
        } catch (Exception e) {
            System.out.println("inny błąd");
        } finally {
            System.out.println("wykonuje  się i tak");
            System.out.println("Będę wypisywać głupoty");
        }

    }


    private static void checkInstanceOfSmallDog(Animal smallDog) {
        System.out.println(smallDog instanceof Cat);
        System.out.println(smallDog instanceof Object);
        System.out.println(smallDog instanceof Animal);
        if (smallDog instanceof Dog) {
            ((Dog) smallDog).go();
        } else {
            System.out.println("wyjebało błąd ale za to nie skończył się pogram :) ");
            System.out.println("Instance of: " + smallDog.getClass());
        }
    }


}