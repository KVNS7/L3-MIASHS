public class Message {
     private String msg;

     public void genererMsg(int n) {
        char[] tab = new char[n];

        for (int i = 0; i < n; i++) tab[i] = (char) i;

        this.msg = new String(tab);
     }

     
     //Retourne vrai si msg contient la chaine de caracteres s
     public boolean contient(String s){
        try{
            return msg.contains(s);
        }catch(NullPointerException e){
            System.err.println("Aucun message contenu dans l'objet");
            return false;
        }
    }
}