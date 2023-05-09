package Tourist;

import Locations.Locations;
import Locations.Palawan;
import Locations.Siargao;
import Locations.Boracay;
import Locations.Elyu;
import Locations.Cebu;
import Locations.Bohol;

public interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);

    void visit(Palawan palawan);

    void visit(Siargao siargao);

    void visit(Elyu elyu);

    void visit(Cebu cebu);

    void visit(Bohol bohol);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}
