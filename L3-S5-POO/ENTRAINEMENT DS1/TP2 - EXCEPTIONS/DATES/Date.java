public class Date {
    int jour;
    int mois;
    int annee;

    public Date(int jour, int mois, int annee) throws DateException{
        if ((jour < 1 || jour > 31)
            || (mois < 1 || mois > 12)
            || (mois == 2 && jour > 28) 
            || (mois < 7 && mois % 2 == 0 && jour == 31)
            || (mois > 8 && mois % 2 == 1 && jour == 31)) {

            throw new DateException(jour, mois, annee);
        }

        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    public static void main(String[] args){
        
        try{
            
            Date d1 = new Date(31, 2, 1885);
            Date d2 = new Date(9, 15, 2005);
            Date d3 = new Date(66, 30, 1966);
                  
        }catch(DateException e){
            System.out.println(e);
        }

        
        
    }
    
}
