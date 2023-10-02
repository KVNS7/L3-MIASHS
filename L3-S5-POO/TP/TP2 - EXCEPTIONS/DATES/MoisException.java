public class MoisException extends DateException{
    
    MoisException(){
        super();
    }

    MoisException(int mois){
        System.out.println("\nLe mois " + mois + " est invalide\n");
    }
}
