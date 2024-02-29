package com.vehicule.Patrons.Composite;

public class SocieteCliente extends Societe{

    public SocieteCliente(String nomSociete,String pays) {
        super(nomSociete,pays);
    }

    @Override
    public void afficherSociete() {
       System.out.println("\t Societe:");
       System.out.println("\t nom: "+this.nomSociete);
       System.out.println("\t pays: "+this.pays);
    }
    
}
