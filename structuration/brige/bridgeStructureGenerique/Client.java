package structuration.brige.bridgeStructureGenerique;

public class Client {
    public static void main(String[] args) {
        Abstraction s1=new RefinedAbstraction(new ConcreteImplementorA());
        s1.operation();
        Abstraction s2=new RefinedAbstraction(new ConcreteImplementorB());
        s2.operation();
}
}