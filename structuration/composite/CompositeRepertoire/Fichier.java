package structuration.composite.CompositeRepertoire;

import java.util.ArrayList;

public class Fichier extends Systeme  {
    ArrayList<Systeme> elements = new ArrayList<Systeme>();
    public Fichier(String nom, String type){
        this.nom = nom;
        this.type = type;
    }
    public  void decrire(){
        System.out.println("description...\nnom:"+this.nom+"\ntype:"+this.type);
    };
    public  void ajouter(Systeme elm ){
        elements.add(elm);
    };
    public void suprimer(int index){
        elements.remove(index);
    };
    public Systeme obtenir(int index){
        return elements.get(index);
    };
}
