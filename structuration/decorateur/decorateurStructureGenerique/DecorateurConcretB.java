package structuration.decorateur.decorateurStructureGenerique;

public class DecorateurConcretB extends Decorateur {
    DecorateurConcretB(ComposantAbstrait composantConcret){
        super(composantConcret);
    }

    public void operation (){
        System.out.println("Decorateur concret B appele operation de omposant concret \n");
        this.composantConcret.operation();
    }

    public void autreOperation(){
        System.out.println("Decorateur concret B appele autreOperation()  \n");
    }

}
