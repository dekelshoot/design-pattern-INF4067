package structuration.decorateur.decorateurSystemeFenetre;

public class FenetreSimple implements Fenetre {
    public void dessiner (){
        System.out.println("dessin de la fenêtre simple \n");
    }
    public void decrire(){
        System.out.println("Description de la fenêtre simple \n");
    }
}
