package edu.craptocraft.ricksy_business;

import java.util.LinkedHashSet;
import java.util.Set;

public class Receptivo implements GuestDispatcher{

    private Set<GuestDispatcher> observers = new LinkedHashSet<>();

    public Receptivo(){}

    public void registra(GuestDispatcher observer) {
        observers.add(observer);
    }

    public void dispatch(CreditCard card) {
        for (GuestDispatcher observer: observers) {
            observer.dispatch(card);
        }
    }
    
}
