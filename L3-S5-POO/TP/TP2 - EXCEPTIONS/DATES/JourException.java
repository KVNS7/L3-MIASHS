public class JourException extends DateException{
    
    JourException(){
        super();
    }

    JourException(int jour){
        System.out.println("\nLe jour " + jour + " est invalide\n");
    }
}
