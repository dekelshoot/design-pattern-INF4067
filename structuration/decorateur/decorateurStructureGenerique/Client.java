package structuration.decorateur.decorateurStructureGenerique;


public class Client {
     public static void main(String[] args) {
        ComposantConcret composantConcret = new ComposantConcret();
        DecorateurConcretA decorateurConcretA = new DecorateurConcretA(composantConcret);
        DecorateurConcretB decorateurConcretB = new DecorateurConcretB(decorateurConcretA);
        
        decorateurConcretA.operation();
        

        System.out.println("\n\n");

        decorateurConcretB.operation();
        decorateurConcretB.autreOperation();
    
}
}
