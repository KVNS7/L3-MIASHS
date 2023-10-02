public class Livre{
    String titre;
    String auteur;
    int nb_pages;
    String editeur;

    Livre (String titre, String auteur, int nb_pages, String editeur){
        this.titre = titre;
        this.auteur = auteur;
        this.nb_pages = nb_pages;
        this.editeur = editeur;
    }

    Livre(String titre, String auteur, int nb_pages){
        this.titre = titre;
        this.auteur = auteur;
        this.nb_pages = nb_pages;
        this.editeur = "p.u.m.n";
    }

    Livre(String titre, String editeur){
        this.titre = titre;
        this.auteur = "melanie notlong";
        this.nb_pages = 501;
        this.editeur = editeur;
    }

    public int lecture(){
        int p = 3;
        return nb_pages * p;
    }

    public static void message(){
        System.out.println("Oh un livre");
    }

    public static void passion(){
        System.out.println("La lecture c'est mon dada");
    }

    public void afficheTitre(){
        System.out.println("\nTitre : " + titre);
    }

    @Override
    public String toString(){
        return "\n'" + titre + "'" + " est un livre de " + auteur + ", composé de " + nb_pages + " pages et édité par " + editeur;
    }
}
