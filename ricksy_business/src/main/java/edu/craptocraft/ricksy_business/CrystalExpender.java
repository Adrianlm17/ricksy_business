package edu.craptocraft.ricksy_business;

public class CrystalExpender implements GuestDispatcher{

    private int stock;
    private double itemCost;

    public CrystalExpender(int stock, double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }

    @Override
    public void dispatch(CreditCard card) {
        if (this.stock > 0 && card.pay(itemCost)) {
            this.stock -= 1;
        }
    }

    @Override
    public String toString(){
        return "Stock: " + this.stock + " \nCoste: " + this.itemCost;
    } 
    
    protected int stock(){
        return this.stock;
    }
}
