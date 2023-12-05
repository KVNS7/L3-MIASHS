public class Film {
    private String realisateur;
    private String titre;
    private String[] acteurs;
    private String pays;

    private int annee_sortie;
    private int duree;

    private static int nbFilms = 0;
    private static Film[] tabFilms = new Film[100];
//---------------------------------------------------------------//

    Film(String titre, String realisateur){
        this.titre = titre;
        this.realisateur = realisateur;
        this.acteurs = null;
        this.pays = null;
        this.annee_sortie = 0;
        this.duree = 0;
        tabFilms[nbFilms] = this;
        nbFilms++;
    }

    Film(String titre, String realisateur, int annee, int duree){
        if(annee < 1891 || annee > 2023){
            System.out.println(annee + " n'est pas une année possible");
            return;
            
        }

        this.titre = titre;
        this.realisateur = realisateur;
        this.acteurs = null;
        this.pays = null;
        this.annee_sortie = annee;
        this.duree = duree;
        tabFilms[nbFilms] = this;
        nbFilms++;
    }

    Film(String titre, String realisateur, String[] acteurs, String pays, int annee, int duree){
        if(annee < 1891 || annee > 2023){
            System.out.println(annee + " n'est pas une année possible");
            return;
        }

        this.titre = titre;
        this.realisateur = realisateur;
        this.acteurs = acteurs;
        this.pays = pays;
        this.annee_sortie = annee;
        this.duree = duree;
        tabFilms[nbFilms] = this;
        nbFilms++;
    }

    public String getRealisateur(){ return this.realisateur; };
    public String getTitre(){ return this.titre; };
    public String[] getActeurs(){ return this.acteurs;};
    public String getPays(){ return this.pays; };
    public int getAnnee(){ return this.annee_sortie; };
    public int getDuree(){ return this.duree; };
    public int getnbFilms(){ return nbFilms; };


    public void setRealisateur(String realisateur){ this.realisateur = realisateur; };
    public void setTitre(String titre){ this.titre = titre; };
    public void setActeurs(String[] acteurs){ this.acteurs = acteurs; };
    public void setPays(String pays){ this.pays = pays; };
    public void setAnnee(int annee){ this.annee_sortie = annee; };
    public void setDuree(int duree){ this.duree = duree; };

    public static void afficherNbFilms(){
        System.out.println("\nNombre de film instanciés : " + nbFilms);
    }

    public static void afficherFilms(){
        if(nbFilms != 0){
            for(int i = 0; i < nbFilms; i++){
                System.out.print("\n");
                System.out.println(tabFilms[i].toString());
            }
        }
    }

    @Override
    public String toString(){
        String liste_acteurs = "";
        if(this.acteurs != null){
            liste_acteurs = this.acteurs[0];
            for(int i = 1; i < this.acteurs.length; i++){
                liste_acteurs += ", " + this.acteurs[i];
            }
        }
        return "Titre : " + this.titre + "\nRealisateur : " + this.realisateur + "\nActeurs principaux : " + liste_acteurs + "\nPays : " + this.pays + "\nAnnee de sortie : " + annee_sortie + "\nDuree : " + this.duree + " minutes";
    }
        
    @Override
    public boolean equals(Object o){
        if (o instanceof Film) {
            Film filmAComparer = (Film) o;
            if(this.realisateur != filmAComparer.realisateur) return false;
            if(this.titre != filmAComparer.titre) return false;
            if(this.acteurs != filmAComparer.acteurs) return false;
            if(this.pays != filmAComparer.pays) return false;
            if(this.annee_sortie != filmAComparer.annee_sortie) return false;
            if(this.duree != filmAComparer.duree) return false;
            return true;
        }
        return false;
    }
    
        public static void main(String[] args) {
            /*Film Film1 = new Film("Dickson Greeting", "William Kennedy Laurie Dickson", 1891, 2);
            System.out.println(Film1.getnbFilms());
            Film Film2 = new Film("Night is short, Walk on girl", "Masaaki Yuasa");
            System.out.println(Film2.getnbFilms());
            Film Film3 = new Film("What's Eating Gilbert Grape", "Lasse Hallstrom",new String[] {"Johnny Depp", "Leonardo Dicaprio","Juliette Lewis"},"Etats-Unis", 1993, 118);
            System.out.println(Film3.getnbFilms());
            Film Film4 = new Film("Sonatine melodie mortelle", "Takeshi Kitano", 1995, 94);            
            System.out.println(Film4.getnbFilms());

            afficherFilms();

            afficherNbFilms();*/
            Film f1 = new Film("Un singe en hiver", "Henri Verneuil");
            Film f2 = new Film("Un singe en hiver", "Henri Verneuil");
            if (f1.equals(f2)) {
                System.out.print("f1 est egale a f2 !");
            } else {
                System.out.print("f1 n’est pas egale a f2 !");
            }
        }

}
