import java.util.Scanner;

public class Main {

    public static void genererTab(){
        int[] tab = new int[10];

        for(int i = 0; i < 10; ++i) tab[i] = i +1;

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Voici le nombre à l'indice demandé : " + tab[sc.nextInt()]);
        }catch(IndexOutOfBoundsException e){
            System.err.println("Msg : mauvaise pioche !");
        }
    }


    public static void main(String[] args) {
        
        //genererTab();

        Message m = new Message();
        m.contient("toto");

    } 
}
