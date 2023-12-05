public class DateException extends Exception{

    DateException(){
        super();
    }

    DateException(int j, int m, int a)throws JourException, MoisException, JourDansMoisException, DateException{
        boolean x = j < 1 || j > 31;
        boolean y = m < 1 || m > 12;

        if(x && y) throw new DateException(j, m);

        if(x) throw new JourException(j);
        if(y) throw new MoisException(m);

        if(m == 2 || j > 29) throw new JourDansMoisException(j, m);

        if((m < 7 && m%2 == 0 && j == 31)
        || (m > 7 && m%2 == 1 && j == 31)) throw new JourDansMoisException(j, m);
    }

    public DateException(int j, int m){
        System.err.println("\nLe jour " + j + " et le mois " + m + " sont incorrects");
    }
}
