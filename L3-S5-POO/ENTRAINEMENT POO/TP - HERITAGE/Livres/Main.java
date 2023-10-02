public class Main {
    public static void main(String[] args) {

        Livre l1 = new Livre("barbes vertigo", "denis-henri levy", 100, "le decouvert");
        ChefdOeuvre l2 = new ChefdOeuvre("et si c'etait niais", "marc levis", 245, "gallimatias");
        Oeuvre l3 = new Oeuvre("quelqu'un m'attend, c'est tout", "anna galvauda", 10, "minuit");
        Oeuvre l4 = new Oeuvre("hygiene du tube (et tout le tremblement)", "gallimatias");
        Livre l5 = new Livre("cosmetique de l'ennui", "soule");
        ChefdOeuvre l6 = new ChefdOeuvre("java exercices a savoir faire pour passer en master", "c. alanoy", 600000);

        System.out.println(l1);
        System.out.println("\nTemps de lecture : " + l1.lecture());
        
        System.out.println(l2);
        System.out.println("\nTemps de lecture : " + l2.lecture());

        System.out.println(l3);
        System.out.println("\nTemps de lecture : " + l3.lecture());

        System.out.println(l4);
        System.out.println("\nTemps de lecture : " + l4.lecture());

        System.out.println(l5);
        System.out.println("\nTemps de lecture : " + l5.lecture());

        System.out.println(l6);
        System.out.println("\nTemps de lecture : " + l6.lecture());
        
        Livre.message();
        Oeuvre.message();
        ChefdOeuvre.message();

        Livre.passion();
        Oeuvre.passion();
        ChefdOeuvre.passion();


        Livre[] tab = {l1, l2, l3, l4, l5, l6};

        for(Livre livre : tab){
            livre.afficheTitre();
            //livre.afficheRecommandation(); // pas possible car spécifique à Oeuvre et ses sous classes
        }

        
    }
}
