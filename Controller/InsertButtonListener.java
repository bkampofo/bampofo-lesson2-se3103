package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Coin;
import Model.CoinDispenser;
import Model.Dime;
import Model.Nickel;
import Model.Quarter;
import View.AppCanvas;

public class InsertButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Coin newCoin = null;
        CoinDispenser CoinDispenser = App.CoinDispenser;
        int selectedIndex = CoinDispenser.selectedSlotIndex;
        int x = 0;
        int y = 0;
        if (selectedIndex == CoinDispenser.SLOY_NICKELS) {
            newCoin = new Nickel();
            x = AppCanvas.X_SLOT
            + CoinDispenser.getNickelCount() * (Nickel.SIZE + 10);

            y = AppCanvas.Y_NICKELS;
        } else if (selectedIndex == CoinDispenser.SLOY_DIMES) {
            newCoin = new Dime();
            x = AppCanvas.X_SLOT
            + CoinDispenser.getDimeCount() * (Dime.SIZE + 10);

            y = AppCanvas.Y_DIMES;
        } else if (selectedIndex == CoinDispenser.SLOY_QUARTERS) {
            newCoin = new Quarter();
            x = AppCanvas.X_SLOT
            + CoinDispenser.getQuarterCount() * (Quarter.SIZE + 10);

            y = AppCanvas.Y_QUARTERS;

        } 

        assert newCoin != null : "Unknown coin type selected";
        newCoin.setLocation(x, y);
        CoinDispenser.getSlot(selectedIndex).push(newCoin);
        App.win.updateWindow();
        
        
}

}
