package structuration.brige.bridgeForme;

public class Client {
    public static void main(String[] args) {
        Forme s1=new RefinedAbstraction(new ConcreteImplementorA());
        s1.colorIt();
        Forme s2=new Cercle(new ConcreteImplementorB());
        s2.colorIt();
}
}