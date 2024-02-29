package com.vehicule.Patrons.Composite;

public abstract class Societe {
    public String nomSociete;
    public String pays;
    public Societe(String nomSociete, String pays) {
        this.nomSociete=nomSociete;
        this.pays = pays;
    }
    public abstract void afficherSociete();

    
}
