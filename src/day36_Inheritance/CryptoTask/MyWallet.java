package day36_Inheritance.CryptoTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MyWallet {
    public static void main(String[] args) {

        Bitcoin bitcoin = new Bitcoin();
        bitcoin.setInfo(50_000,0.12,280_000_000,590_000,110_000_000,false);

        Cardano cardano = new Cardano();
        cardano.setInfo(450,25,380_000_000,50_000_000,21_000_000,true);

        Doge doge = new Doge();
        doge.setInfo(200,34,450_000_000,270_000_000,160_000_000,true);

        Ethereum ethereum = new Ethereum();
        ethereum.setInfo(20_000,1.2,205_000_000,800_000,46_000_000,true);

        XRP xrp = new XRP();
        xrp.setInfo(650,5,28_000_000,6_000_000,11_500_000,false);

        ArrayList<CryptoToken> list = new ArrayList<>();
        list.addAll(Arrays.asList(bitcoin,cardano,doge,ethereum,xrp));
        System.out.println(list);

        double totalPrice = 0;
        for(CryptoToken each : list){
            totalPrice += each.totalPrice();
        }

        System.out.println(totalPrice);
    }

}
