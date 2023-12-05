package tp5.util;

import tp5.exception.CalculatriceException;

public class Calculatrice {
    private static int nbOperations = 0;

    public static int addition(int a, int b) {
        nbOperations++;
        return a+b;
    }

    public static int soustraction(int a, int b){
        nbOperations++;
        return a-b;
    }
    
    public static int multiplication(int a, int b){
        nbOperations++;
        return a*b;
    }
    
    public static int division(int a, int b) throws CalculatriceException{

        if(b==0) throw new CalculatriceException("Division par 0 !");
        nbOperations++;
        return a/b;

    }
}
