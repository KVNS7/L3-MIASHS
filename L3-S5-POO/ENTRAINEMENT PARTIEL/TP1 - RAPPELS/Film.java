public class Film {
    private String titre;
    private String realisateur;
    private String[] acteurs;
    private String pays;
    private int anneeSortie;
    private int duree;

    private static int nbFilms = 0;
    private static Film[] tabFilms = new Film[0];

    public Film(){
        nbFilms++;

        Film[] newTab = new Film[tabFilms.length+1];
        System.arraycopy(tabFilms, 0, newTab, 0, tabFilms.length);
        newTab[newTab.length-1] = this;
        tabFilms = newTab;
    }

    public Film(String titre, String realisateur){
        this.titre = titre;
        this.realisateur = realisateur;
        
        nbFilms++;
        Film[] newTab = new Film[tabFilms.length+1];
        System.arraycopy(tabFilms, 0, newTab, 0, tabFilms.length);
        newTab[newTab.length-1] = this;
        tabFilms = newTab;
    }

    public Film(String titre, String realisateur, int annee, int duree){
        if(annee < 1891 || annee > 2023){
            System.out.println("annee incorrecte : " + annee);
        }else{
            this.titre = titre;
            this.realisateur = realisateur;
            this.anneeSortie = annee;
            this.duree = duree;
        
            nbFilms++;
            Film[] newTab = new Film[tabFilms.length+1];
            System.arraycopy(tabFilms, 0, newTab, 0, tabFilms.length);
            newTab[newTab.length-1] = this;
            tabFilms = newTab;
        }
    }

    public Film(String titre, String realisateur,String[] acteurs, String pays, int annee, int duree){
        if(annee < 1891 || annee > 2023){
            System.out.println("annee incorrecte : " + annee);
        }else{
            this.titre = titre;
            this.realisateur = realisateur;
            this.acteurs = acteurs;
            this.pays = pays;
            this.anneeSortie = annee;
            this.duree = duree;
            
            nbFilms++;
            Film[] newTab = new Film[tabFilms.length+1];
            System.arraycopy(tabFilms, 0, newTab, 0, tabFilms.length);
            newTab[newTab.length-1] = this;
            tabFilms = newTab;
        }
    }

    @Override
    public String toString(){
        String film = "\nTitre : " + titre;
        film += "\nRealisateur : " + realisateur;

        film += "\nActeur : ";

        if(acteurs == null){
            film += "non renseigné";
        }else{
            for(int i = 0; i < acteurs.length; ++i) film += acteurs[i] + ", ";
        }

        film += "\nPays : " + pays;
        film += "\nAnnee de sortie : " + anneeSortie;
        film += "\nDuree : " + duree;

        return film;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Film){
            Film filmAComparer = (Film) o;
            if(this.titre != filmAComparer.titre) return false;
            if(this.realisateur != filmAComparer.realisateur) return false;
            if(this.acteurs != filmAComparer.acteurs) return false;
            if(this.pays != filmAComparer.pays) return false;
            if(this.anneeSortie != filmAComparer.anneeSortie) return false;
            if(this.duree != filmAComparer.duree) return false;
            return true;
        }
        return false;
        
    }

    public String getTitre() {return titre;}
    public String getRealisateur() {return realisateur;}
    public String[] getActeurs() {return acteurs;}
    public String getPays() {return pays;}
    public int getAnneeSortie() {return anneeSortie;}
    public int getDuree() {return duree;}

    public void setTitre(String titre) {this.titre = titre;}

    public void setRealisateur(String realisateur) {this.realisateur = realisateur;}

    public void setActeurs(String[] acteurs) {this.acteurs = acteurs;}

    public void setPays(String pays) {this.pays = pays;}

    public void setAnneeSortie(int anneeSortie) {
        if(anneeSortie < 1891 || anneeSortie > 2023) System.out.println("annee incorrecte : " + anneeSortie);
        else this.anneeSortie = anneeSortie;
    }

    public void setDuree(int duree) {this.duree = duree;}

    public static void afficherNbFilms(){
        System.out.println("\nNombre de films : " + nbFilms);
    }

    public static void afficherFilms(){
        for(int i = 0; i < tabFilms.length; ++i){
            System.out.println(tabFilms[i]);
        }
    }

}


/* 




*/