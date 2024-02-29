package com.vehicule.Patrons.Composite;

import java.util.ArrayList;

import com.vehicule.api.Data.SocietesData;



public class GroupeSocieteCliente extends Societe {
    ArrayList<Societe> societes = new ArrayList<Societe>();

    public GroupeSocieteCliente(String nomSociete, String pays) {
        super(nomSociete,pays);
        societes.add(this);
    }



    public GroupeSocieteCliente(String nomSociete, String pays, ArrayList<Societe> societes ) {
        super(nomSociete,pays);
        societes.add(this);
        this.societes = societes;
    }



    @Override
    public void afficherSociete() {
        System.out.println("\t Groupe: "+this.nomSociete);
       System.out.println("\t Societes:");
       System.out.println("\t\t nom:    \t\tpays:");
       
       for(Societe s: societes){
        System.out.println("\t\t "+s.nomSociete+"\t\t "+s.pays);
       }
    }

    public void ajouterSociete(Societe societe){
        this.societes.add(societe);
    }
    public void supprimerSociete(Societe societe){
        this.societes.remove(societe);
    }

    public Societe getSociete(int index){
        return this.societes.get(index);
    }

    public int gSocieteCount(){
        return this.societes.size();
    }
}
