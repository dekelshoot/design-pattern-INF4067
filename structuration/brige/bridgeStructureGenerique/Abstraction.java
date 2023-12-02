package structuration.brige.bridgeStructureGenerique;

public abstract class Abstraction {
    Implementor implementor;
    Abstraction(Implementor implementor){
    this.implementor=implementor;
    }
    abstract public void operation();
}
