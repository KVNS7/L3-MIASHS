public class LigneManquanteException extends Exception{
    
    LigneManquanteException(){
        super();
    }

    LigneManquanteException(int nb){
        System.out.println("\nLa ligne " + nb + " n'existe pas dans le fichier !\n");
    }
}
