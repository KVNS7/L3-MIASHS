public class Message {
    private String msg;

    Message(){
        this.msg = new String();
    }

    public void genererMsg(int n) {
        char[] tab = new char[n];

        for (int i = 0; i < n; i++) {
            tab[i] = (char) i;
        }

        this.msg = new String(tab);
    }
    
    public boolean contient(String s) {
       return msg.contains(s);
    }

    public static void main(String[] args) {
        Message m = new Message();
        m.contient("toto");
    }

}
