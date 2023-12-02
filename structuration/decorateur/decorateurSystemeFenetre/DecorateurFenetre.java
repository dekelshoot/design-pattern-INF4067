package structuration.decorateur.decorateurSystemeFenetre;

public class DecorateurFenetre implements Fenetre {
    Fenetre fentre;

    DecorateurFenetre(Fenetre fentre) {
        this.fentre = fentre;
    }
    public void dessiner (){
        System.out.println("Decorateur fenêtre appele dessiner() de fenêtre simple \n");
        this.fentre.dessiner();
    }
    public void decrire(){
        System.out.println("Decorateur fenêtre appele decrire() de fenêtre simple \n");
        this.fentre.decrire();
    }

}
