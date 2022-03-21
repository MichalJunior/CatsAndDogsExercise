package com.company.exercises.extend.animals.abstracts;

public abstract class Animal {


    /**
     * gdy jedna  metoda tutaj-dajGlos jest abstrakcyjna to
     * całą klasę musimy zrobić abstrakcyjną
     * metoda abstrakcyjna nie może posiadać ciała gdyż aklasach dziedzicących będziemy ją nadpisywać
     * klasy abstrakcyjnej niemożemy instancjonować jak tutaj //Animal chomik = new Animal();
     * szystkie klasy dziedziczące z klasy abstrakcyjnej przejmują  metody tej klasy
     */
    public abstract void giveVoice();


}
