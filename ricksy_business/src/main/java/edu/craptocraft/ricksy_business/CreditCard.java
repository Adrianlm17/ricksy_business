package edu.craptocraft.ricksy_business;

public class CreditCard {

    private final String owner;
    private final String number;

    public CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + this.owner + " Numero: " + this.number;
    }

}