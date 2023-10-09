public class Securise extends Compte{

    /* ---------------------------- CONSTRUCTEURS ---------------------------- */
    
    public Securise(String titulaire, double solde){
        super(titulaire, solde);
    }

    /* ------------------------------ METHODES ------------------------------- */

    @Override
    public void debiter(double montant){
        if((this.getSolde() - montant) >= 0){

            super.debiter(montant);
            
        }
        else System.out.println("Solde insuffisant pour un débit de " + montant);
    }
    
    /* ------------------------------- GETTERS ------------------------------- */
    /* ------------------------------- SETTERS ------------------------------- */

}