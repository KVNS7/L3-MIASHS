import java.awt.Color;

public class Main {
    
    public static void main(String[] args) {

        Personnage Luke = new Jedi("Luke", 75, 10, 10, 6, Color.blue);
        SoldatClone Soldat1 = new SoldatClone("Soldat1", 25, 20);

        System.out.println(Luke.getVie());

        Soldat1.tireBlaster(Luke);
        Soldat1.allumerBlaster();
        Soldat1.tireBlaster(Luke);

        System.out.println(Luke.getVie());
    }
}
