package structuration.composite.CompositeRepertoire;

import java.util.ArrayList;

public class Dossier extends Systeme  {
    ArrayList<Systeme> elements = new ArrayList<Systeme>();
    Dossier(String nom, String type){
        this.nom = nom;
        this.type = type;
    }
    public  void decrire(){
        System.out.println("description...\nnom:"+this.nom+"\ntype:"+this.type);
        for(int i=0; i<elements.size();i++){
            System.out.println("élement"+i+1);
            elements.get(i).decrire();
        }
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
