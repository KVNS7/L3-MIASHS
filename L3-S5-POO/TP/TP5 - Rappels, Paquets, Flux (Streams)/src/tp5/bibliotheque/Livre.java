package tp5.bibliotheque;

public class Livre {
    String ISBN;
    String titre;
    String auteur;
    int anneePublication;

    public Livre(String iSBN, String titre, String auteur, int annee) {
        this.ISBN = iSBN;
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = annee;
    }

    public String getISBN() {
        return ISBN;
    }

}
