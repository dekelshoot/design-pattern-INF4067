package structuration.composite.ComositeTexte;

import java.util.ArrayList;

public class Section extends Texte{
    ArrayList<Texte> texte = new ArrayList<Texte>();

    public int longueur(){
        return texte.size();
    };
    public void ajout(Texte txt){
        texte.add(txt);
    };
    public void retrait(int index){
        texte.remove(index);
    };
    public void print(){
        System.out.println("Je suis un Texte de type Section\n je suis de taille "+texte.size());
    }
}
