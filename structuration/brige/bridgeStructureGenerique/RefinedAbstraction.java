package structuration.brige.bridgeStructureGenerique;

public class RefinedAbstraction extends Abstraction{
    RefinedAbstraction(Implementor implementor) {
        super(implementor);
        }
    public void operation() {
        System.out.print("refinedAbstraction filled with ");
        implementor.operationImp();
        }
}
