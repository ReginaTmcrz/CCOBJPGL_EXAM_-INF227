package Locations;

import Tourist.Me;
import Tourist.Tourist;

public class Cebu implements Locations {

    public static int airFare = 400;


    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
       
        
    }
}