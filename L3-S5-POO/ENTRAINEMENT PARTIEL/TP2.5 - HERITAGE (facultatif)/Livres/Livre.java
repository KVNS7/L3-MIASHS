public class Livre {
    String titre;
    String auteur;
    int nbPages;
    String editeur;

    public Livre(String t, String a, int nbP, String e) {
        this.titre = t;
        this.auteur = a;
        this.nbPages = nbP;
        this.editeur = e;
    }

    public Livre(String t, String a, int nbP){
        this.titre = t;
        this.auteur = a;
        this.nbPages = nbP;
        this.editeur = "p.u.m.n";
    }

    public Livre(String t, String e){
        this.titre = t;
        this.auteur = "melanie notlong";
        this.nbPages = 501;
        this.editeur = e;
    }

    public int lecture(){
        return nbPages * 2;
    }


    @Override
    public String toString(){
        String texte = "Titre : " + titre;
        texte += "\nAuteur : " + auteur;
        texte += "\nNombre de pages : " + nbPages;
        texte += "\nEditeur : " + editeur;

        return texte;
    }

    public static void message(){
        System.out.println("Oh un livre");
    }

    public static void main(String[] args) {
        Livre l1 = new Livre("Livre 1", "Editos");
        Livre l2 = new Oeuvre("Livre 2", "Editos", true, 2);
        Livre l3 = new ChefdOeuvre("Livre3", "Editos", true, 3);

        System.out.println(l1.lecture());
        System.out.println(l2.lecture());
        System.out.println(l3.lecture());
    }
}
