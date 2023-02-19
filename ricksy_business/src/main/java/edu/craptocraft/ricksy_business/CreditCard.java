package edu.craptocraft.ricksy_business;

public class CreditCard {

    private final String owner;
    private final String number;
    private double credit = 3000;

    public CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + this.owner + " Numero: " + this.number;
    }

    public String number() {
        return this.number;
    }

    public double credit() {
        return this.credit;
    }

    public boolean pay(double charge) {
        if (charge <= this.credit){
            this.credit -= charge;
            return true;
        } else {
            return false;
        }
    }

    public String cardOwner() {
        return this.owner;
    }

}
