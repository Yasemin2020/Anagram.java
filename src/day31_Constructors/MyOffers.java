package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1= new Offer();
        offer1.setInfo("VA","Amazon Inc", "SDET", 110000, true,true,true,true);
        Offer offer2=new Offer();
        offer2.setInfo("CA", "Sony Inc", "QA", 120000,true,false,false,true);
        Offer offer3=new Offer();
        offer3.setInfo("FL","Apple Inc", "QE",125000, true, true, true,false);
        Offer offer4=new Offer();
        offer4.setInfo("TX", "Capital One", "SM", 115000,false,false,false,true);
        Offer offer5=new Offer();
        offer5.setInfo("WA","Bank of America", "BA",130000, true, true, true,false);

        Offer[] myOffers={offer1, offer2, offer3, offer4, offer5};
        ArrayList<Offer> fullTimeOffers=new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p-> !p.isFullTime);// removes if the offer is not fullTime
        System.out.println("fullTimeOffers = " + fullTimeOffers.size());

        ArrayList<Offer> localOffers= new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p-> !p.location.equals("VA")||!p.location.equals("CA"));

        System.out.println("localOffers = " + localOffers.size());






    }
}
