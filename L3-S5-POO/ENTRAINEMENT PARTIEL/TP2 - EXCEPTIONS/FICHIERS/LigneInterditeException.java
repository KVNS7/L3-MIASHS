public class LigneInterditeException extends Exception{
    
    public LigneInterditeException(){
        super();
    }

    public LigneInterditeException(int x){
        System.err.println("\nMsg: la ligne " + x + " est interdite en lecture !\n");
    }

}
