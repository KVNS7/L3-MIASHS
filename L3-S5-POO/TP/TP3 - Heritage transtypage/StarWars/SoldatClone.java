public class SoldatClone extends Personnage{
    private Blaster blaster;
    
    SoldatClone(String nom, int x, int y){
        super(nom,100, x, y, 4, 2);
        this.blaster = new Blaster();
    }

    void parler(){System.out.println("Je m'appelle" + this.getNom());};

    void tireBlaster(Personnage p){
        if(this.blaster.getAllume() == true){
            p.seBlesse(this.blaster, this);
        }else{
            System.out.println("Blaster éteint !");
        }
    }

    public void allumerBlaster(){
        blaster.allumer();
    }
}
