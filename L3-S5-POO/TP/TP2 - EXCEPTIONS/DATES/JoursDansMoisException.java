public class JoursDansMoisException extends DateException{
    
    JoursDansMoisException(){
        super();
    }

    JoursDansMoisException(int jour, int mois){
        System.out.println("\nLe jour " + jour + " est invalide pour le mois " + mois + "\n");
    }
}
