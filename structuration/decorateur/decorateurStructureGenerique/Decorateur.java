package structuration.decorateur.decorateurStructureGenerique;

public class Decorateur implements ComposantAbstrait {
    ComposantAbstrait composantConcret;

    Decorateur(ComposantAbstrait composantConcret) {
        this.composantConcret = composantConcret;
    }
    public void operation (){
        System.out.println("Decorateur  appele operation() de composant Concret \n");
        this.composantConcret.operation();
    }


}
