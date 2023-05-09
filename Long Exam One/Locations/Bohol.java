package Locations;

import Tourist.Me;
import Tourist.Tourist;

public class Bohol implements Locations {

    public static int airFare = 300;
    
    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);

 
    }
}