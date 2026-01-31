package Controller;

import javax.swing.JFrame;

import Model.CoinDispenser;
import View.AppWindow;

public class App {

    public static final AppWindow win = new AppWindow();

    public static final CoinDispenser CoinDispenser = new CoinDispenser( 10, 012, 8 );

    public static void main(String[] args) {

        win.init();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setLocation(300, 200);

        win.pack();
        win.setVisible(true);
       
    }
    
}
