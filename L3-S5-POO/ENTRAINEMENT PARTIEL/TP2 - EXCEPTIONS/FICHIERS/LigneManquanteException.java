public class LigneManquanteException extends Exception{
    
    public LigneManquanteException(){
        super();
    }

    public LigneManquanteException(int x){
        System.err.println("\nMsg: la ligne " + x + " n'existe pas dans le fichier !\n");
    }
}
