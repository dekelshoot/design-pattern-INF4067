package structuration.brige.bridgeForme;


public class Client {
    public static void main(String[] args) {
        Forme s1=new Rectangle(new Rouge());
        s1.colorIt();
        Forme s2=new Cercle(new Blue());
        s2.colorIt();
}
}