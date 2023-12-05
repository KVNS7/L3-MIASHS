public class DateException extends Exception{
    
    DateException(){
        super();
    }

    DateException(int jour, int mois, int annee) throws JourException, MoisException, JoursDansMoisException{
        if (jour < 1 || jour > 31) {
            throw new JourException(jour);
        }
        if(mois < 1 || mois > 12){
            throw new MoisException(mois);
        }
        
        if(mois == 2){
            if(jour > 28) throw new JoursDansMoisException(jour, mois);
        }

        if(mois < 7){
            if(mois % 2 == 0){
                if(jour == 31) throw new JoursDansMoisException(jour, mois);
            }
        }
        if(mois > 8){
            if(mois %2 == 1){
                if(jour == 31) throw new JoursDansMoisException(jour, mois);
            }
        }
    }
}
