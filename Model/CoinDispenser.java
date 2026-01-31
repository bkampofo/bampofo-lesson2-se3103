package Model;

import java.util.ArrayList;
import java.util.Stack;

public class CoinDispenser {

    public static final int SLOY_NICKELS = 0;
    public static final int SLOY_DIMES = 1;
    public static final int SLOY_QUARTERS = 2;

    
    private final ArrayList<Stack<Coin>> slots = new ArrayList<>(3);

    public final int maxNickels;
    public final int maxDimes;
    public final int maxQuarters;

    public int selectedSlotIndex = 0;
    public Object maxQuarter;
    

    public CoinDispenser(int maxNickels, int maxDimes, int maxQuarters) {
        this.maxNickels = maxNickels;
        this.maxDimes = maxDimes;
        this.maxQuarters = maxQuarters;
        slots.add(new Stack<Coin>()); // nickels
        slots.add(new Stack<Coin>()); // dimes
        slots.add(new Stack<Coin>()); // quarters
    }

    public void insert (Coin c) {
        int slotIndex = -1;
        if (c instanceof Nickel) {
            assert getNickelCount() < maxNickels : "Nickel slot full";
            slotIndex = SLOY_NICKELS;
        } else if (c instanceof Dime) {
             assert getDimeCount() < maxDimes : "Dime slot full";
            slotIndex = SLOY_DIMES;
        } else if (c instanceof Quarter) {
             assert getQuarterCount() < maxQuarters : "Quarter slot full";
            slotIndex = SLOY_QUARTERS;
        }
        assert slotIndex >= 0 : "Wrong coin Index to insert a coin";
        slots.get(slotIndex).push(c);
     
    }
    
    public void removeCoinByValue (int coinValue) {
        int slotIndex = -1;
        switch (coinValue) {
            case Nickel.VALUE:
                assert getNickelCount() > 0 : "Nickel slot empty";
                slotIndex = SLOY_NICKELS;
                break;
            case Dime.VALUE:
                assert getDimeCount() > 0 : "Dime slot empty";
                slotIndex = SLOY_DIMES;
                break;
            case Quarter.VALUE:
                assert getQuarterCount() > 0 : "Quarter slot empty";
                slotIndex = SLOY_QUARTERS;               
    }

        assert slotIndex >= 0 : "Unknown coin Index to remove a coin";
        slots.get(slotIndex).pop();
}



    public Stack<Coin> getSlot(int index) {
        return slots.get(index);
    }

    public int getNickelCount() {
        return slots.get(SLOY_NICKELS).size();

    }

    public int getDimeCount() {
        return slots.get(SLOY_DIMES).size();
    }

    public int getQuarterCount() {
        return slots.get(SLOY_QUARTERS).size();
    }

    public int getBalance() {
        int balance = getNickelCount() * Nickel.VALUE
                + getDimeCount() * Dime.VALUE
                + getQuarterCount() * Quarter.VALUE;
                      
        return balance;
    }

}
