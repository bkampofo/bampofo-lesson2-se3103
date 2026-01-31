package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.CoinDispenser;
import View.AppWindow;

public class CoinTypeButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
       int slotIndex = -1;
         switch (e.getActionCommand()) {
            case AppWindow.radioButtonActionNickel:
                slotIndex = CoinDispenser.SLOY_NICKELS;
                break;
            case AppWindow.radioButtonActionDime:
                slotIndex = CoinDispenser.SLOY_DIMES;   
                break;
            case AppWindow.radioButtonActionQuarter:
                slotIndex = CoinDispenser.SLOY_QUARTERS;
                break;
   
    }

    assert slotIndex < 0 : "unknown coin Slot Index ";
    App.CoinDispenser.selectedSlotIndex = slotIndex;
    App.win.updateWindow();
}


}

   




    

