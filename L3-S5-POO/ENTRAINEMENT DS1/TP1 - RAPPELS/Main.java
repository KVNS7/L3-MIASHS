import java.util.Scanner;

public class Main{

    static int[] saisieTableau(int n){
        int[] tab = new int[n];
        Scanner entree = new Scanner(System.in);

        for(int i = 0; i < n; i++){
            System.out.println("Saisir un entier:");
            int nb = entree.nextInt();
            tab[i] = nb;
        }
        entree.close();
        return tab;
    }

    static int[] initTab(int n){
        int[]tab = new int[n];

        for(int i = 0; i < n; i++){
            tab[i] = i*10;
        }

        return tab;
    }

    static void afficherTab(int[] tab){
        for(int i = 0; i < tab.length; i++){
            System.out.println("tab[" + i + "] = " + tab[i]);
        }
    }

    static int sommePair(int[] tab){
        int somme = 0;

        for(int i = 0; i < tab.length; i++){
            if(tab[i] % 2 == 0) somme += tab[i];
        }
        return somme;
    }

    static int[] echanger(int[] tab, int i, int j){
        if(i < 0 || i > (tab.length - 1)){
            System.out.println("La position " + i + " est incorrecte pour ce tableau, elle doit être comprise entre 0 et " + (tab.length-1));
            return tab;
        }
        if(j < 0 || j > (tab.length - 1)){
            System.out.println("La position " + j + " est incorrecte pour ce tableau, elle doit être comprise entre 0 et " + (tab.length-1));
            return tab;
        }
        int temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;

        return tab;

    }

    public static void main(String[] args) {
        //int[] tab1 = saisieTableau(4);

        //System.out.println("\nNombre en position 2 :\n" + tab1[2]);

        int[] tab2 = initTab(5);
        System.out.println("\nNombre en position 4 :\n" + tab2[4]);

        int[] tab3 = initTab(10);
        afficherTab(tab3);


        int tab4[] = {8, 7, 12, 13, 15, 17, 20, 13, 5, 9};
        System.out.println("\nSomme pair tab4 = " + sommePair(tab4));

        echanger(tab4, 0, 3);
        afficherTab(tab4);

        
    }
}