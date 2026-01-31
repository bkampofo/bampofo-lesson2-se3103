package Controller;

import java.awt.event.ActionListener;

import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import Model.CoinDispenser;

public class RemoveButtonListener implements ActionListener{

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        
        CoinDispenser coinDispenser = App.CoinDispenser;
        int selectedIndex = coinDispenser.selectedSlotIndex;
        assert 0 <= selectedIndex && selectedIndex <= 2 : "Invalid slot index selected";
        assert coinDispenser.getSlot(selectedIndex).size() > 0 : "Selected slot is empty";
        coinDispenser.getSlot(selectedIndex).pop();
        App.win.updateWindow();
}

    
}