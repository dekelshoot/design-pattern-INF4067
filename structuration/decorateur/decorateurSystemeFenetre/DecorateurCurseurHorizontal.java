package structuration.decorateur.decorateurSystemeFenetre;

public class DecorateurCurseurHorizontal extends DecorateurFenetre {
    DecorateurCurseurHorizontal(Fenetre fenetre){
        super(fenetre);
    }

    public void dessiner (){
        System.out.println("Decorateur Curseur Horizontal appele dessiner() de fenêtre simple \n");
        this.fentre.dessiner();
    }
    public void decrire(){
        System.out.println("Decorateur Curseur Horizontal appele decrire() de fenêtre simple \n");
        this.fentre.decrire();
    }

    public void dessinerCurseurHorizontal(){
        System.out.println("Decorateur Curseur Horizontal dessiner curseur Horizontal \n");
    }
}
