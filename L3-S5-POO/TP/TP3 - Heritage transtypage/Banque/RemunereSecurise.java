public class RemunereSecurise extends Remunere{
    

    /* ---------------------------- CONSTRUCTEURS ---------------------------- */
    
    public RemunereSecurise(String titulaire, double solde, double taux){
        super(titulaire, solde, taux);
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