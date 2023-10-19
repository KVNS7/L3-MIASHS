import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Jedi extends Personnage{
    private Sabre sabre;

    Jedi(String nom, int vie, int force, Color couleur){
        super(nom, vie, 5, force);
        this.sabre = new Sabre(couleur);
    }

    Jedi(String nom, int force){
        super(nom, 20, 5, force);
        this.sabre = new Sabre(Color.BLUE);
    }

    void parler(){System.out.println("Que la force soit avec vous");};

    void coupSabre(Personnage p){
        if(this.sabre.getAllume()){
            p.seBlesse(this.sabre, this);
        }else{
            System.out.println("Sabre éteint !");
        }
    }

    public void allumerSabre(){
        sabre.allumer();
    }

    public void eteindreSabre(){
        sabre.eteindre();
    }

    public static List<Jedi> genererListeJedi(int n){
        ArrayList<Jedi> Liste = new ArrayList<Jedi>();
        Random rand = new Random();
        int force;

        for(int i = 0; i < n; i++){
            if(n<=10) force = 10;
            else force = (rand.nextInt((n+1)-10) + 10);

            Jedi J = new Jedi("Jedi" + i, force);
            Liste.add(J);
        }

        return Liste;
    }

    public static List<Jedi> trier(List<Jedi> listeJedi) { // ? METHODE CHATGPT : DEMANDER AU PROF SI AUTRE MÉTHODE
        Collections.sort(listeJedi, new Comparator<Jedi>() {
            @Override
            public int compare(Jedi jedi1, Jedi jedi2) {
                return jedi1.getForce() - jedi2.getForce();
            }
        });
        return listeJedi;
    }

    @Override
    public String toString() {
        return "\nJedi : " + getNom() + " \n" +
               "Arme : " + sabre.toString() + "\n" + super.toString();
    }

}
