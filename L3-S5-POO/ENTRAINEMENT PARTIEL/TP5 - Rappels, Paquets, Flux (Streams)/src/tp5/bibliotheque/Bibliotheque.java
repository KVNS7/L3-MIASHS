package tp5.bibliotheque;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Bibliotheque {
    Map <String, Livre> livres;
    Map <String, Utilisateur> utilisateurs;

    Bibliotheque(){
        this.livres = new HashMap<>();
        this.utilisateurs = new HashMap<>();
    }

    public void ajouterLivre(Livre livre){
        this.livres.put(livre.getISBN(), livre);
    }

    public void ajouterLivre(String iSBN, String titre, String auteur, int annee){
        this.livres.put(iSBN, new Livre(iSBN, titre, auteur, annee));
    }

    public void retirerLivre(Livre livre){
        this.livres.remove(livre.getISBN());
    }

    public void retirerLivre(String ISBN){
        this.livres.remove(ISBN);
    }

    public void inscrireUtilisateur(Utilisateur utilisateur){
        this.utilisateurs.put(utilisateur.getNumeroAdherent(), utilisateur);
    }

    public void inscrireUtilisateur(String nom){ // ! A FAIRE
        this.utilisateurs.put(nom, new Utilisateur(nom));
    }

    public void desinscrireUtilisateur(Utilisateur utilisateur){
        this.utilisateurs.remove(utilisateur.getNumeroAdherent());
    }

}
