import java.util.Random;

public class ChefdOeuvre extends Oeuvre{
    double popularite;

    public ChefdOeuvre(String t, String a, int nbP, String e, int c, boolean r,double p) {
        super(t, a, nbP, e, c, r);
        this.popularite = p;
    }
    
    public ChefdOeuvre(String t, String a, int nbP, boolean r, double p){
        super(t, a, nbP, r);
        this.popularite = p;
    }

    public ChefdOeuvre(String t, String e, boolean r, int c){
        super(t, e, r, c);
        this.popularite = 0.8;
    }

    @Override
    public int lecture(){
        return (int) (3.0 / 2.0 * super.lecture());
    }

    public static void message(){
        System.out.println("Ah que c’est beau");
    }

    public void like(){
        Random random = new Random();
        int rand = random.nextInt(10) + 1;

        if(rand < 8){this.recommandation = true;}
        else {this.recommandation = false;}
    }

    @Override
    public String toString(){
        String texte = "\nPopularité : " + popularite;
        return super.toString() + texte;
    }
}
