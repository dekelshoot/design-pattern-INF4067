package structuration.decorateur.decorateurStructureGenerique;

public class DecorateurConcretA extends Decorateur {
    DecorateurConcretA(ComposantAbstrait composantConcret){
        super(composantConcret);
    }

    public void operation (){
        System.out.println("Decorateur concret A appele operation de omposant concret \n");
        this.composantConcret.operation();
    }


}
