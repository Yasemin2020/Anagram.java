package day51_Map;

import jdk.swing.interop.SwingInterOpUtils;

public class TestEnum {
    public static void main(String[] args) {
       // String browser ="Wooden Spoon";b

        Browser browser = Browser.SAFARI;
        Browser browser2= Browser.EDGE;
        switch(browser){
            case FIREFOX:
                System.out.println("Firefox is selected");
                break;

            case SAFARI:
                System.out.println("Safari is selected");
                break;

            case OPERA:
                System.out.println("Opera is selected");
                break;

            case EDGE:
                System.out.println("Edge is selected");
                break;

            default:
                System.out.println("Chrome is selected");
        }

        System.out.println("----------------------------------------");

        Seasons season = Seasons.SUMMER;


    }
}