package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

import Controller.App;
import Model.Coin;
import Model.CoinDispenser;

public class AppCanvas extends JPanel{

    public static final int WIDTH = 700;
    public static final int HEIGHT = 300;

    public static final int X_SLOT = 90;
    public static final int Y_TITLE = 50;
    public static final int Y_NICKELS = 100;
    public static final int Y_DIMES = 170;
    public static final int Y_QUARTERS = 240;


    final Font  titleFont = new Font("Curier New", Font.BOLD, 30);
    final  Font cointTypeFont = new Font("Curier New", Font.ITALIC, 14);

    final Color nickelColor = Color.RED;
    final Color dimeColor = Color.BLUE;
    final Color quarterColor = Color.GREEN;



    public AppCanvas() {
       setPreferredSize( new Dimension( WIDTH, HEIGHT ) );
    }

    private void drawCoin (Graphics2D g2, Coin c) {
        
        var e = new Ellipse2D.Float(c.getX(), c.getY(), c.getSize(), c.getSize());
        g2.fill(e);
    }
      

    private void drawCoinSlots (Graphics2D g2)  { 
        g2.setColor(nickelColor);
        for (var c :App.CoinDispenser.getSlot(CoinDispenser.SLOY_NICKELS)) {
            drawCoin(g2, c);
        }
        g2.setColor(dimeColor);
        for (var c :App.CoinDispenser.getSlot(CoinDispenser.SLOY_DIMES)) {
            drawCoin(g2, c);
        }g2.setColor(quarterColor);
        for (var c :App.CoinDispenser.getSlot(CoinDispenser.SLOY_QUARTERS)) {
            drawCoin(g2, c);
        }
       
    }
    
    public void drawTestString(Graphics2D g) {
        CoinDispenser coinDispenser = App.CoinDispenser;
        g.setFont(titleFont);
        g.drawString(
            String.format("Coins Dispenser (balance = %d)", 
            coinDispenser.getBalance()), X_SLOT, Y_TITLE);
        g.setFont(cointTypeFont);
        g.drawString(
            String.format("Nickels: %d/%d", coinDispenser.getNickelCount(), 
            coinDispenser.maxNickels), 100,  Y_NICKELS);
        g.drawString(
            String.format("Dimes: %d/%d", coinDispenser.getDimeCount(), 
            coinDispenser.maxDimes), 100, Y_DIMES);
        g.drawString(
            String.format("Quarters: %d/%d", coinDispenser.getQuarterCount(),
             coinDispenser.maxQuarter), 100, Y_QUARTERS);
    }


    public void paintComponent(Graphics g) {
          super.paintComponent(g);

          Graphics2D g2 = (Graphics2D) g;
          drawTestString(g2);
          drawCoinSlots(g2);

    }
    

}
