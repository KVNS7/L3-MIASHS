import java.util.Random;

public class Oeuvre extends Livre{
    double critique;
    boolean recommandation;

    Oeuvre(String titre, String auteur, int nb_pages, String editeur){
        super(titre, auteur, nb_pages, editeur);
        this.critique = 1;
        this.recommandation = false;
    }

    Oeuvre(String titre, String auteur, int nb_pages){
        super(titre, auteur, nb_pages);
        this.critique = 5;
    }

    Oeuvre(String titre, String editeur){
        super(titre, editeur);
        this.critique = 1;
        this.recommandation = false;
    }

    public int lecture(){
        return super.lecture() * 2;
    }

    public static void message(){
        System.out.println("J'adore les classiques");
    }

    public void like(){
        Random random = new Random();
        int rand = random.nextInt(10) + 1;

        if(rand < 7){this.recommandation = true;}
        else {this.recommandation = false;}
    }

    public void afficheRecommandation(){
        System.out.println("\nRecommendation : " + recommandation);
    }

    @Override
    public String toString(){
        return super.toString() + ".\nLa critique qui lui est donnée est de " + critique + ".\n Recommandé : " + recommandation;
    }
}
