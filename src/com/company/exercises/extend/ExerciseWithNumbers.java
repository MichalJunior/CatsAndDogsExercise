package com.company.exercises.extend;

public class ExerciseWithNumbers {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println("wynik z dzielenia to " + a);
        } catch (ArithmeticException ex) {
            System.out.println("Coś pojebałeś z dzieleniem patafianie" + ex.getMessage());
        }
    }
}
