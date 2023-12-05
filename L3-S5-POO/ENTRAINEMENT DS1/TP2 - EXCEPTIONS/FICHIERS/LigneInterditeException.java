public class LigneInterditeException extends Exception{
    
    LigneInterditeException(){
        super();
    }

    LigneInterditeException(int nb){
        System.out.println("La ligne " + nb + " est interdite en lecture !\n");
    }


}
