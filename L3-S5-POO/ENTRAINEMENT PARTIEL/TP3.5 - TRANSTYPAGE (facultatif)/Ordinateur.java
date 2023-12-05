public class Ordinateur {
    public int numeroSerie;

    public Ordinateur(int nb_serie){
        this.numeroSerie = nb_serie;
    }

    public void identite(){
        System.out.println("Je suis un ordinateur");
    }

    public int getNumeroSerie(){return numeroSerie;}
    
    public static void main(String[] args) {
        
    }
}
