package Test;

import Model.Coin;
import Model.Dime;
import Model.Nickel;
import Model.Quarter;

public class Ref {
    
    public static void main(String[] args) {

        Coin c;
       // c = new Coin(15, 30);

       c = new Dime(); // super,= sub
       Dime d = new Dime();
       c = d; // super = sub
      // d = c;     
      
      
    Coin[] array = new Coin[5];
    array[0] = new Dime();
    array[1] = new Quarter();
    array[2] = new Nickel();
    array[3] = new Dime();
    array[4] = new Quarter();

    for (Coin coin : array) {
        System.out.println(coin.getValue());
    }
}

}
