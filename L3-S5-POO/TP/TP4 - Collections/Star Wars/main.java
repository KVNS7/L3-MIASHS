import java.util.List;
import java.util.ListIterator;

public class main {
    
    public static void main(String[] args){

        List<SoldatClone> ListeClone = SoldatClone.genererListeClone(1000); // crée liste de 1000 SoldatClone

        System.out.println(ListeClone); // Affiche la liste

        ListIterator<SoldatClone> iterator = ListeClone.listIterator(ListeClone.size()); // Crée une ref pour l'itérateur de ListeClone

        while(iterator.hasPrevious()){ // Parcours toute la liste
            SoldatClone clone = iterator.previous();
            int nbClone = Integer.parseInt(clone.getNom().substring(5)); // Prend la valeur a partir de l'indice 5 dans le nom du clone et le transforme en int
            
            if(nbClone % 2 == 0) iterator.remove(); // si nbClone pair, supprime le SodatClone de la liste
        }
        
        for (SoldatClone S : ListeClone) { // Affiche la liste
            System.out.println(S);
        }

    } 

}
