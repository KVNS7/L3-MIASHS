public abstract class Compte {

    private String titulaire;
    private double solde;
    private int ID;
    public static int nb_comptes;
    
    /* ---------------------------- CONSTRUCTEURS ---------------------------- */

    public Compte(String titulaire, double solde) {
        this.titulaire = titulaire;
        this.solde = solde;
        this.ID = nb_comptes++;
    }

    /* ------------------------------ METHODES ------------------------------- */

    public void crediter(double montant){
        this.solde += montant;
        System.out.println("Le compte " + this.ID + " à été crédité de " + montant + ".");
    }

    public void debiter(double montant){
        this.solde -= montant;
        System.out.println("Le compte " + this.ID + " à été débité de " + montant + ".");
    }

    @Override
    public String toString(){
        return "\n***************************\nCompte n°\t: " + this.ID + "\nTitulaire\t: " + this.titulaire + "\nSolde\t\t: " + this.solde + "\n***************************\n";
    }

    /* ------------------------------- GETTERS ------------------------------- */

    public double getSolde() {
        return this.solde;
    }

    /* ------------------------------- SETTERS ------------------------------- */

}
