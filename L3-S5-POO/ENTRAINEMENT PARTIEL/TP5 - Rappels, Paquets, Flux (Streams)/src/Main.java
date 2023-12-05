import tp5.exception.CalculatriceException;
import tp5.util.Calculatrice;

public class Main{
    public static void main(String[] args) {

        try {
            System.out.println("10/2 = " + Calculatrice.division(10,2));
            System.out.println("3/0 = " + Calculatrice.division(3, 0));
        } catch (CalculatriceException e) {
            e.printStackTrace();
        }
        
    }
    
}