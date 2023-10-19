import java.util.ArrayList;
import java.util.List;

public class SoldatClone extends Personnage{
    private Blaster blaster;
    
    SoldatClone(String nom){
        super(nom,100, 4, 2);
        this.blaster = new Blaster();
    }

    void parler(){System.out.println("Je m'appelle" + this.getNom());};

    void tireBlaster(Personnage p){
        if(this.blaster.getAllume() == true){
            p.seBlesse(this.blaster, this);
        }else{
            System.out.println("Blaster éteint !");
        }
    }

    public void allumerBlaster(){
        blaster.allumer();
    }

    public void eteindreBlaster(){
        blaster.eteindre();
    }



    public static List<SoldatClone> genererListeClone(int n){
        ArrayList<SoldatClone> Liste = new ArrayList<SoldatClone>();

        for(int i = 0; i < n; i++){
            SoldatClone soldat = new SoldatClone("Clone" + i);
            Liste.add(soldat);
        }

        return Liste;
    };

    @Override
    public String toString() {
        return "\nSoldat clone : " + getNom() + " \n" +
               "Blaster : " + blaster.getPui() + "\n" +
               super.toString();
    }

}
