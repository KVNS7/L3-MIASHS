public class Personnage {
    private String nom;
    private int vie;
    private int x = 0;
    private int y = 0;
    private int vitesse;
    private int force;

    Personnage(String nom, int vie, int vitesse, int force){
        this.nom = nom;
        this.vie = vie;
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

    public void seDeplace(int dx, int dy, int dt){
        x += (int) dx * dt * vitesse / Math.sqrt(dx*dx + dy*dy);
        y += (int) dy * dt * vitesse / Math.sqrt(dx*dx + dy*dy);
    };

    public void seBlesse(Arme a, Personnage p){
        vie -= a.getPui() * p.getForce();
    };

    public int getForce(){return force;};

    public String getNom(){return nom;};

    public int getVie(){return vie;};

    public int getVitesse(){return vitesse;};

    public int getX(){return x;};

    public int getY(){return y;};

    @Override
    public String toString() {
        return "Vie: " + vie + "\n" +
               "Vitesse: " + vitesse + "\n" +
               "Force: " + force + "\n";
    }
}
