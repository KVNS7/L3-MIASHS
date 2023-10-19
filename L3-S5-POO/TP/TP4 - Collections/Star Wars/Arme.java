public class Arme {
    private boolean allume = false;
    private int puissance;

    public Arme(int pui){
        this.puissance = pui;
    }

    public void allumer(){this.allume = true;};

    public void eteindre(){this.allume = false;};

    public int getPui(){return puissance;};

    public boolean getAllume(){return allume;};

}