import java.util.Random;
import java.util.Scanner;

public class Main{
    
    public static void genererTab(){
        Scanner entree = new Scanner(System.in);
        Random rand = new Random();
        int[] tab = new int[10];

        for(int i = 0; i < tab.length; i++){
            int random = rand.nextInt(101);
            tab[i] = random;
        }
        System.out.println("Saisir un nombre : ");
        int nb = entree.nextInt();
        
        try{
            System.out.println(tab[nb]);
        }catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Mauvaise pioche !");
        }

        entree.close();
    }

    public static void main(String[] args) {
        genererTab();
    }
}