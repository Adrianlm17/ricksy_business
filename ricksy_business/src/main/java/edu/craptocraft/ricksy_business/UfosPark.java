package edu.craptocraft.ricksy_business;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UfosPark implements GuestDispatcher{

    private double fee = 500;
    private final Map<String, String> flota = new HashMap<String, String>();

    public UfosPark(){}

    @Override
    public String toString(){
        return "Nombres: " + flota.keySet();
    }

    public void add(String ufosID) {
        flota.putIfAbsent(ufosID, null);
    }

    @Override
    public void dispatch(CreditCard card) {
        Map.Entry<String, String> ufo = null;

        if(!flota.containsValue(card.number())){
            for (Map.Entry<String, String> entry : this.flota.entrySet()){
                if (entry.getValue() == null){
                    ufo = entry;
                    break;
                }
            }
        }
        if (ufo != null && card.pay(fee)){
            this.flota.put(ufo.getKey(), card.number());
        }
    }

    public String getUfoOf(String number) {
        String ovniID = null;
        
        if (this.flota.containsValue(number)){
            for (Map.Entry<String, String> entry: this.flota.entrySet()){
                if (entry.getValue() == number){
                    ovniID = entry.getKey();
                    break;
                }
            }
        }
        return ovniID;
    }

    public boolean containsCard(String cardNumber) {
        return this.flota.containsValue(cardNumber);
    }

    public Collection<String> cardNumbers() {
        return this.flota.values();
    }
    
}
