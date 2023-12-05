import java.util.Random;

public class ChefdOeuvre extends Oeuvre{
    double popularite;

    ChefdOeuvre(String titre, String editeur){
        super(titre,editeur);
        this.popularite = 0.8;
    }

    ChefdOeuvre(String titre, String auteur, int nb_pages){
        super(titre, auteur, nb_pages);
        this.like();
    }

    ChefdOeuvre(String titre, String auteur, int nb_pages, String editeur){
        super(titre, auteur, nb_pages, editeur); 
        this.like();
    }

    public int lecture(){
        return (super.lecture() * 3) / 2;
    }

    public static void message(){
        System.out.println("Ah que c'est beau");
    }

    public void like(){
        Random random = new Random();
        int rand = random.nextInt(10) + 1;

        if(rand < 8){this.recommandation = true;}
        else {this.recommandation = false;}
    }

    @Override
    public String toString(){
        return super.toString() + "\nSa popularité est de " + (popularite*100) + "%";
    }
}
