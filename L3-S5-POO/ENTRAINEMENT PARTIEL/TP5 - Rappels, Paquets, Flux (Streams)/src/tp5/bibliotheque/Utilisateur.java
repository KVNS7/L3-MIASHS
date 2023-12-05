package tp5.bibliotheque;

public class Utilisateur {
    String numeroAdherent;
    String nom;

    public Utilisateur(String numeroAdherent, String nom) {
        this.numeroAdherent = numeroAdherent;
        this.nom = nom;
    }
    
    public String getNumeroAdherent() {
        return numeroAdherent;
    }
}
