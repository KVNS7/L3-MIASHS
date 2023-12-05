import java.util.Random;

public class Oeuvre extends Livre{
    int critique;
    boolean recommandation;

    public Oeuvre(String t, String a, int nbP, String e, int c, boolean r) {
        super(t, a, nbP, e);
        this.critique = c;
        this.recommandation = r;
    }

    public Oeuvre(String t, String a, int nbP, boolean r){
        super(t, a, nbP);
        this.critique = 5;
        this.recommandation = r;
    }

    public Oeuvre(String t, String e, boolean r, int c){
        super(t, e);
        this.critique = c;
        this.recommandation = r;
    }

    public static void message(){
        System.out.println("J’aime les classiques");
    }

    public static void passion(){
        System.out.println("La lecture c'est mon dada");
    }

    @Override
    public int lecture(){
        return super.lecture()*2;
    }

    public void like(){
        Random random = new Random();
        int rand = random.nextInt(10) + 1;

        if(rand < 7){this.recommandation = true;}
        else {this.recommandation = false;}
    }

    @Override
    public String toString(){
        String texte = "\nCritique : " + critique;
        texte += "\nrecommandation : " + recommandation;
        return super.toString() + texte;
    }
}
