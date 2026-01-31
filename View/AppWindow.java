package View;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

import Controller.CoinTypeButtonListener;
import Controller.InsertButtonListener;
import Controller.RemoveButtonListener;

public class AppWindow extends JFrame{

    public static final String radioButtonActionNickel = "Nickel";
    public static final String radioButtonActionDime = "Dime";
    public static final String radioButtonActionQuarter = "Quarter";
     public static final String radioButtonActionInsert = "Insert";
    public static final String radioButtonActionRemoveove = "Remove";


    private AppCanvas canvas = new AppCanvas();


    public void init() {
        var cp = this.getContentPane();
        cp.add(canvas, BorderLayout.CENTER);

        JPanel southPanel = new JPanel();
        cp.add(southPanel, BorderLayout.SOUTH);

        southPanel.setLayout(new GridLayout(2,1));

        // 3 radion buttons for coin types
        JPanel coinTypePanel = new JPanel();
        coinTypePanel.setBorder(new TitledBorder("Coin Type"));
        JRadioButton nickelButton = new JRadioButton(radioButtonActionNickel);
        JRadioButton dimeButton = new JRadioButton(radioButtonActionDime);
        JRadioButton quarterButton = new JRadioButton(radioButtonActionQuarter);
        ButtonGroup coinGroup = new ButtonGroup();
        coinGroup.add(nickelButton);
        coinGroup.add(dimeButton);
        coinGroup.add(quarterButton);
        coinTypePanel.add(nickelButton);
        coinTypePanel.add(dimeButton);
        coinTypePanel.add(quarterButton);
        southPanel.add(coinTypePanel);

        CoinTypeButtonListener CoinTypeButtonListener = new CoinTypeButtonListener();
        nickelButton.addActionListener(CoinTypeButtonListener);
        dimeButton.addActionListener(CoinTypeButtonListener);      
        quarterButton.addActionListener(CoinTypeButtonListener);


        // B Button for insert and remove
        JPanel actionPanel = new JPanel();
        actionPanel.setBorder(new TitledBorder("Action"));
        JButton insertButton = new JButton(radioButtonActionInsert);
        JButton removeButton = new JButton(radioButtonActionRemoveove);
        actionPanel.add(insertButton);
        actionPanel.add(removeButton);
        southPanel.add(actionPanel);

        InsertButtonListener insertButtonListener = new InsertButtonListener();
        RemoveButtonListener removeButtonListener = new RemoveButtonListener();
        insertButton.addActionListener(insertButtonListener);
        removeButton.addActionListener(removeButtonListener);
        

    }

    public void updateWindow() {
        //updade components if needed
        canvas.repaint();

    }
  
}
