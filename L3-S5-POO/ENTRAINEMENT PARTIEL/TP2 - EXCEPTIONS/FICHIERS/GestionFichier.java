import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GestionFichier {
    String nomFichier;
    int random;

    public GestionFichier(){
        boolean choosed = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("\nVeuillez entrer un nom de fichier :");

        while(!choosed){
            try{
                String saisie = sc.nextLine();
                if(saisie.equalsIgnoreCase("STOP")) System.exit(0);

                FileReader f = new FileReader(saisie);
                choosed = true;
                
                this.nomFichier = saisie;
                f.close();

            }catch(FileNotFoundException a){
                System.out.println("\nNom de fichier invalide veuillez recommencer : ");
                choosed = false;

            }catch (IOException b){
                System.out.println("Erreur : Tentative de lecture / fermeture sur un fichier fermé !");
            }
        }
        Random random = new Random();
        this.random = random.nextInt(10)+1;
    }

    public void lire()throws LigneInterditeException, LigneManquanteException{
        Scanner sc = new Scanner(System.in);
        System.out.println("\nVeuillez entrer le numéro de la ligne à lire : ");
        
        int nbLigne = sc.nextInt();
        if(nbLigne == random) throw new LigneInterditeException(nbLigne);
        
        
        try{
            BufferedReader f = new BufferedReader(new FileReader(this.nomFichier));
            String ligne = null;

            for(int i = 0; i < nbLigne; ++i)ligne = f.readLine();
            f.close();
            if(ligne == null) throw new LigneManquanteException(nbLigne);

            System.out.println(ligne); // affiche la ligne
            
        }catch(FileNotFoundException a){

            System.err.println("\nNom de fichier invalide !");
        
        }catch(IOException b){
        
            System.err.println("Erreur : Tentative de lecture / fermeture sur un fichier fermé !");
        
        }
    }


    public static void main(String[] args) {
        GestionFichier gf = new GestionFichier();
        try{
            gf.lire();
        }catch(LigneInterditeException a){}
        catch(LigneManquanteException b){}
    }
}
