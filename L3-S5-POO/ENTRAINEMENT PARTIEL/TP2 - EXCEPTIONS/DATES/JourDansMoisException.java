public class JourDansMoisException extends DateException{
    
    public JourDansMoisException(){
        super();
    }

    public JourDansMoisException(int j, int m){
        System.err.println("\nJour " + j + " incorrect pour le mois " + m);
    }
}
