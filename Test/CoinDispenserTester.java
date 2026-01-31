package Test;

import Model.Coin;
import Model.CoinDispenser;
import Model.Dime;
import Model.Nickel;
import Model.Quarter;

public class CoinDispenserTester {

    public static void main(String[] args) {

        CoinDispenser cd = new CoinDispenser(5, 6, 4);
        cd.insert(new Dime());
        cd.insert(new Dime());
        cd.insert(new Dime());
        cd.insert(new Quarter());
        cd.insert(new Quarter());
        cd.insert(new Nickel());
        cd.insert(new Nickel());
        cd.insert(new Nickel());
        cd.insert(new Nickel());
        assert cd.getDimeCount() ==3;
        assert cd.getQuarterCount() ==2;
        assert cd.getNickelCount() ==5;
        cd.removeCoinByValue(Dime.VALUE);
        assert cd.getDimeCount() ==4;

    }
}
