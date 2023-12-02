package structuration.decorateur.decorateurSystemeFenetre;

public class DecorateurCurseurVertical extends DecorateurFenetre {
    DecorateurCurseurVertical(Fenetre fenetre){
        super(fenetre);
    }

    public void dessiner (){
        System.out.println("Decorateur Curseur vertical appele dessiner() de fenêtre simple \n");
        this.fentre.dessiner();
    }
    public void decrire(){
        System.out.println("Decorateur Curseur vertical appele decrire() de fenêtre simple \n");
        this.fentre.decrire();
    }

    public void dessinerCurseurVertical(){
        System.out.println("Decorateur Curseur vertical dessiner curseur vertical \n");
    }

}
