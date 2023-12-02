package structuration.decorateur.decorateurSystemeFenetre;


public class Client {
     public static void main(String[] args) {
        Fenetre fenetreSimple = new FenetreSimple();
        DecorateurCurseurVertical decorateurCurseurVertical = new DecorateurCurseurVertical(fenetreSimple);
        DecorateurCurseurHorizontal decorateurCurseurHorizontal = new DecorateurCurseurHorizontal(fenetreSimple);
        
        decorateurCurseurVertical.dessinerCurseurVertical();
        decorateurCurseurVertical.dessiner();
        decorateurCurseurVertical.decrire();

        System.out.println("\n\n");

        decorateurCurseurHorizontal.dessinerCurseurHorizontal();
        decorateurCurseurHorizontal.dessiner();
        decorateurCurseurHorizontal.decrire();
}
}
