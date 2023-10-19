import java.awt.Color;

public class Jedi extends Personnage{
    private Sabre sabre;

    Jedi(String nom, int vie, int x, int y, int force, Color couleur){
        super(nom, vie, x, y, 5, force);
        this.sabre = new Sabre(couleur);
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

    pbulci void eteindreSabre(){
        sabre.eteindre();
    }

}
