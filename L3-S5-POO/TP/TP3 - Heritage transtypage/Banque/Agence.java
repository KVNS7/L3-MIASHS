public class Agence {
    private String nom;
    public Compte[] annuaire;       // ? ajouter variable nb_compte_annuaire ??

    /* ---------------------------- CONSTRUCTEURS ---------------------------- */

    public Agence(String nom){
        this.nom = nom;
        this.annuaire = new Compte[20];
    }

    /* ------------------------------ METHODES ------------------------------- */

    public void ajouter(Compte c){
        this.annuaire[Compte.nb_comptes - 1] = c; // ! probleme car utilise nb_comptes
    }

    public void supprimer(int n){ // ! probleme car si on supprime un compte, ceux d'apres ne seront plus a la position de leur id
        for(int i = n; i < Compte.nb_comptes - 1; i++){ // ! trouver moyen de chercher par id -> sortir id chaque objet du tab
            this.annuaire[i] = this.annuaire[i+1]; 
        }
    }

    public String toString(){
        String resultat = "\nListe des comptes de l'agence " + this.nom + " :\n\n";

        for(int i = 0; i < Compte.nb_comptes; i++){
            if(this.annuaire[i] == null) break;
            resultat = resultat + (this.annuaire[i].toString()) + "\n";
        }

        return resultat;
    }
    
    /* ------------------------------- GETTERS ------------------------------- */
    /* ------------------------------- SETTERS ------------------------------- */
    
}
