import java.util.Scanner;


public class Main {

    static int[] saisieTableau(int n){
        int[] tab = new int[n];
        Scanner entree = new Scanner(System.in);

        for(int i = 0; i < n; ++i) tab[i] = entree.nextInt();
        
        return tab;
    }

    static int[] initTab(int n){
        int[] tab = new int[n];
        for(int i = 0; i < n; ++i) tab[i] = i * 10;
        
        return tab;
    }

    static void afficherTab(int[] tab){
        for(int i = 0; i < tab.length; ++i){
            System.out.printf("Tab[%d] = %d%n", i, tab[i]);
        }
    }

    static int sommePair(int[] tab){
        int sum = 0;
        
        for(int i = 0; i < tab.length; ++i){
            if(tab[i]%2 == 0) sum += tab[i];
        }
        return sum;
    }

    static int[] echanger(int[] tab, int i, int j){
        if(i < 0 || i > tab.length-1){
            System.out.println("\ni incorrect !");
            return tab;
        }
        if(j < 0 || j > tab.length-1){
            System.out.println("\nj incorrect !");
            return tab;
        }

        int temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;

        return tab;
    }

    static int[] maximum(int[] tab){
        int max = tab[0];
        int indice = 0;

        for(int i = 1; i < tab.length; ++i){
            if(tab[i] > max){
                max = tab[i];
                indice = i;
            }
        }
        int[] val = {max, indice};
        return val;
    }

    static int compteSup(int[] tab, int v){
        int cpt = 0;
        for(int i = 0; i < tab.length; ++i)if(tab[i] > v) cpt++;
        return cpt;
    }

    static int rechercher(int[] tab, int v){
        for(int i = 0; i < tab.length; ++i) if(tab[i] == v) return i;
        return -1;
    }

    static boolean estTrie(int[] tab){
        for(int i = 1; i < tab.length; ++i) if(tab[i] < tab[i-1]) return false;
        return true;
    }

    static int[] fusion(int[] tab1, int[] tab2){
        int[] tab = new int[tab1.length + tab2.length];
        int i;
        for(i = 0; i <tab1.length; ++i) tab[i] = tab1[i];
        for(int j = 0; j < tab2.length; ++j) tab[i++] = tab2[j];

        return tab;
    }

    public static void main(String[] args) {

        int[] tab = initTab(10);
        int tab2[] = {8, 7, 12, 13, 15, 17, 20, 13, 5, 9};

        afficherTab(tab);
        System.out.println("Somme pairs tab2 = " + sommePair(tab2));
        echanger(tab, 10, 3);
        afficherTab(tab);
        int[] tab2max = maximum(tab2);
        System.out.printf("\nMaximum : t[%d] = %d\n", tab2max[1], tab2max[0]);
        System.out.println(estTrie(tab));

        afficherTab(fusion(tab, tab2));

/*
        String[] acteurs = {"Johnny Depp", "Leonardo Dicaprio", "Juliette Lewis"};
        Film f1 = new Film("Dickson Greeting", "William Kennedy Laurie", 1891, 2);
        Film f2 = new Film("Night is short, Walk on Girl", "Masaaki Yuasa");
        Film f3 = new Film("What s Eating Gilbert Grape", "Lasse Hallstrom", acteurs, "Etats-Unis", 1993, 118);
        Film f4 = new Film("Sonatine melodie mortelle", "Takeshi Kitano", 1995, 94);
        Film f5 = new Film("Dickson Greeting", "William Kennedy Laurie", 1891, 2);

        System.out.println("f1 equals f5 : " + f1.equals(f5));
        System.out.println(f3);
        
        Film.afficherNbFilms();
        Film.afficherFilms();
*/
    }
 
}
/* 


*/