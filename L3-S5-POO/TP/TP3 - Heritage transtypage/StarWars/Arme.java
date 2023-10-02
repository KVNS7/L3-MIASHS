public class Arme {
    private boolean allume;
    private int puissance;

    Arme(int pui){
        this.allume = false;
        this.puissance = pui;
    }

    public void allumer(){this.allume = true;};

    public void eteindre(){this.allume = false;};

    public int getPui(){return puissance;};

    public boolean getAllume(){return allume;};

}