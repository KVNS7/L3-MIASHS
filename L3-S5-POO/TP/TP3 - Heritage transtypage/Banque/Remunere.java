public class Remunere extends Compte{
    
    private double taux;

    /* ---------------------------- CONSTRUCTEURS ---------------------------- */
    
    public Remunere(String titulaire, double solde, double taux){
        super(titulaire, solde);
        this.taux = taux;
    }

    /* ------------------------------ METHODES ------------------------------- */

    public void calculInteret(){
        double interets = this.getSolde() * taux;

        this.crediter(interets);
        System.out.println("Intérêts perçus : " + interets + "\nNouveau solde : " + this.getSolde());
    }
    
    /* ------------------------------- GETTERS ------------------------------- */
    /* ------------------------------- SETTERS ------------------------------- */

}