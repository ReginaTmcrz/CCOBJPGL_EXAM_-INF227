package Tourist;


import javax.sound.sampled.SourceDataLine;
import javax.xml.transform.Source;

import Locations.*;

public class Me implements Tourist {

    static int budget = 1000;
   

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {

        System.out.println("---------------- 2023 Summer Travels ----------------");
        System.out.println();

         System.out.println("Location: Boracay");
         System.out.println("Your Account Balance: " + budget);
         System.out.println("Boracay Air Fare = " + boracay.airFare);
         System.out.println();

         if (budget > boracay.airFare){
            budget = budget - boracay.airFare;
            System.out.println("Status: You can visit Boracay! " );
            System.out.println("Current Money Below..");
            checkBudget();

         } else{
            System.out.println(" Status: Your budget is not enough, Sorry you can't visit Boracay");
         }

   
        System.out.println("-------------------- Next Trip --------------------");
        System.out.println();
    }

    

    public void visit(Palawan palawan) {
        System.out.println("Location: Palawan");
        System.out.println("Account Balance: " + budget);
        System.out.println("Palawan Air Fare: " + palawan.airFare);

        System.out.println();
        if (budget > palawan.airFare){
            budget = budget - palawan.airFare;
           System.out.println("Status: You can visit Palawan! " );
           System.out.println("Current Money Below...");
           checkBudget();
        } else{
           System.out.println("Status: Your budget is not enough, Sorry you can't visit Palawan");
        }

  
       System.out.println("-------------------- Next Trip --------------------");
       System.out.println();


    }



    public void visit(Elyu elyu){

        System.out.println("Location: La Union");
        System.out.println("Account Balance: " + budget);
        System.out.println("La Union Fare: " + elyu.airFare);
   

        System.out.println();
        if (budget > elyu.airFare){
           budget = budget - elyu.airFare;
           System.out.println("Status: You can visit La Union! " );
           System.out.println("Current Money Below...");
           checkBudget();
    
        } else{
           System.out.println("Status: Your budget is not enough, Sorry you can't visit La Union!");
        }

  
       System.out.println("-------------------- Next Trip --------------------");
       System.out.println();
    }



    public void visit (Cebu cebu){
        System.out.println("Location: Cebu");
        System.out.println("Account Balance: " + budget);
        System.out.println("Cebu Air Fare: " + cebu.airFare);
   

        System.out.println();
        if (budget > cebu.airFare){
           budget = budget - cebu.airFare;
           System.out.println("Status: You can visit Cebu! " );
           System.out.println("Current Money Below...");
           checkBudget();
    
        } else{
           System.out.println("Status: Your budget is not enough, Sorry you can't visit Cebu!");
        }

  
       System.out.println("-------------------- Next Trip --------------------");
       System.out.println();

    }

    public void visit (Bohol bohol){
        System.out.println("Location: Bohol");
        System.out.println("Account Balance: " + budget);
        System.out.println("Bohol Air Fare: " + bohol.airFare);
   

        System.out.println();
        if (budget > bohol.airFare ) {
            budget = budget - bohol.airFare;
           System.out.println("Status: You can visit Bohol! " );
           System.out.println("Current Money Below...");
           checkBudget();
    
        } else{
           System.out.println("Status: Your budget is not enough, Sorry you can't visit Bohol!");
        }

  
       System.out.println("-------------------- Next Trip --------------------");
       System.out.println();

    }


    public void visit (Siargao siargao){
        System.out.println("Location: Siargao");
        System.out.println("Account Balance: " + budget);
        System.out.println("Siargao Air Fare: " + siargao.airFare);
   

        System.out.println();
        if (budget > siargao.airFare ) {
            budget = budget - siargao.airFare;
           System.out.println("Status: You can visit Siargao! " );
           System.out.println("Current Money Below...");
           checkBudget();
    
        } else{
           System.out.println("Status: Your budget is not enough, Sorry you can't visit Siargao!");
        }

  
       System.out.println("-------------------- Next Trip --------------------");
       System.out.println();

    }



   
    public void checkBudget() {

       System.out.println(budget);
      
    }

  

}
