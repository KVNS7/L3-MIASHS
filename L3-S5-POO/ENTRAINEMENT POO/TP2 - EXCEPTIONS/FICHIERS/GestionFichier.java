import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GestionFichier {
    String nom_fichier;
    int random;

    GestionFichier(){
        Scanner entree = new Scanner(System.in); // ? non fermé sinon System.in n'est plus utilisable, aucune solution trouvée à l'erreur
        boolean fichier_valide = false;

        System.out.println("\nVeuillez entrer un nom de fichier :");

        while(!fichier_valide){ 
            try{
                String saisie = entree.nextLine(); // enregistre la saisie de l'utilisateur pour le nom de fichier
                if(saisie.equalsIgnoreCase("STOP")) System.exit(0); // si saisie = STOP, fin du programme

                FileReader f = new FileReader(saisie); // affecte la saisie a un FileReader (liseur de fichier)
                fichier_valide = true;  // si pas d'exception attrapée, fichier valide
                this.nom_fichier = saisie; // affecte le nom du fichier a la variable de l'objet 
                f.close(); // ferme le liseur de fichier

            }catch (FileNotFoundException a){ // attrape l'exception fichier non trouvé
                System.out.println("\nNom de fichier invalide veuillez recommencer : "); //demande re saisie
                fichier_valide = false; // fichier invalide puis recommence le while
            }catch (IOException b){
                System.out.println("Erreur : Tentative de lecture / fermeture sur un fichier fermé !");
            }
        }

        Random random = new Random();
        this.random = random.nextInt(10)+1; // génère et affecte un nombre aléatoire entre 1 et 10 (entre 0+1 et 9+1)
    }


    void Lire() throws LigneInterditeException, LigneManquanteException{

        Scanner entree = new Scanner(System.in); // ? non fermé sinon System.in n'est plus utilisable, aucune solution trouvée à l'erreur

        System.out.println("\nVeuillez entrer le numéro de la ligne à lire : ");
        int nbL = entree.nextInt(); // enregistre la saisie de l'utilisateur pour le numero de ligne à lire

        if(nbL == random) throw new LigneInterditeException(nbL); // si la ligne demandée est la ligne interdite, exception relevée
        String ligne = null;
        BufferedReader fichierTampon = null;

        try{

            fichierTampon = new BufferedReader(new FileReader(nom_fichier)); // ouvre un liseur de fichier
            
            try{
                for(int i = 0; i< nbL; i++){ // avance à la ligne demandée, valeur "null" si dépasse ÷≠
                    ligne = fichierTampon.readLine();
                }
                if(ligne == null){ // relève l'exception ligne manquante si ligne = null
                    throw new LigneManquanteException(nbL);
                } 

                System.out.println(ligne); // affiche la ligne

            }catch(IOException b){ 
                System.out.println("Erreur : Tentative de lecture / fermeture sur un fichier fermé !");
            }

        }catch(FileNotFoundException a){

            System.out.println("Erreur : Fichier introuvable !");

        }finally{ // finir parfermer le

            try{
                fichierTampon.close(); 
            }catch (IOException b){
                System.out.println("Erreur : Tentative de lecture / fermeture sur un fichier fermé !");
            }

        }
        
    }

    public static void main(String[] args) {
        GestionFichier Test = new GestionFichier();
        
        try{
            Test.Lire();
        }catch(LigneInterditeException e){
            System.out.println(e);
        }catch(LigneManquanteException f){
            System.out.println(f);
        }
    
    }
}
