package edu.craptocraft.ricksy_business;

import java.util.ArrayList;
import java.util.List;

public class RickMenuDispatcher implements GuestDispatcher{
    
    private int stock;
    private double menuCost;

    private final List<String> orders = new ArrayList<String>(); 
    
    public RickMenuDispatcher(){}
    
    @Override
    public void dispatch(CreditCard card) {
        if (this.stock > 0 && card.pay(menuCost)) {
            this.stock -= 1;
            this.orders.add(card.cardOwner());
        }
    }

    @Override
    public String toString() {
        return "Stock: " + this.stock + " \n " + this.orders.toString();
    }
    
    
}
