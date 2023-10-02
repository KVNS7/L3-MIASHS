public class Personnage {
    private String nom;
    private int vie;
    private int x;
    private int y;
    private int vitesse;
    private int force;

    Personnage(String nom, int vie, int x, int y, int vitesse, int force){
        this.nom = nom;
        this.vie = vie;
        this.x = x;
        this.y = y;
        this.vitesse = vitesse;
        this.force = force;
    }

    Personnage(int vitesse){
        this.vitesse = vitesse;
    }

    Personnage(int pv, int vitesse, int force){
        this.vie = pv;
        this.vitesse = vitesse;
        this.force = force;
    }

    public void seDeplace(){};

    public void seBlesse(Arme a, Personnage p){
        vie -= a.getPui() * p.getForce();
    };

    public String toString(){
        return nom + " possède " + vie + " pv / ";
    }

    public int getForce(){return force;};

    public String getNom(){return nom;};

    public int getVie(){return vie;};
}
