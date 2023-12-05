public class MoisException extends DateException{
    
    public MoisException(){
        super();
    }

    public MoisException(int m){
        System.err.println("\nLe mois " + m + " est incorrect");
    }
}
