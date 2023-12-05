public class JourException extends DateException {
    
    public JourException(){
        super();
    }

    public JourException(int j){
        System.err.println("\nLe jour " + j + " est incorrect");
    }
}
