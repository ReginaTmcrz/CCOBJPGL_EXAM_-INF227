
import Locations.*;
import Tourist.*;

public class App {
    public static void main(String[] args) throws Exception {

        Locations boracay = new Boracay(); 
        Locations palawan = new Palawan();
        Locations siargao = new Siargao();
        Locations elyu = new Elyu();
        Locations cebu = new Cebu();
        Locations bohol = new Bohol();

        Tourist me = new Me();


        boracay.accept(me);
        palawan.accept(me);
        siargao.accept(me);
        elyu.accept(me);
        cebu.accept(me);
        bohol.accept(me);


        
    }
}
