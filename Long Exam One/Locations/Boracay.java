package Locations;

import Tourist.Me;
import Tourist.Tourist;

public class Boracay implements Locations {

    public static int airFare = 100;
    
    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);

 
    }
}