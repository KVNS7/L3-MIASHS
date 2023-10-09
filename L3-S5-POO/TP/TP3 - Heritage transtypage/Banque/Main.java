public class Main {
    public static void main(String[] args) {
        
    Agence Agency = new Agence("Agency");

        Compte a = new Courant("Arthur", 2343.38);
        Agency.ajouter(a);
        Compte b = new Securise("Lancelot", 43000.20);
        Agency.ajouter(b);
        Compte c = new Remunere("Perceval",1200,0.02);
        Agency.ajouter(c);

        System.out.println(Agency);
        
    }
}
