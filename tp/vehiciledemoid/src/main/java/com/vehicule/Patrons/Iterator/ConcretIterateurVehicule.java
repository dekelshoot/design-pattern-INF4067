package com.vehicule.Patrons.Iterator;

import com.vehicule.Patrons.AbstractFactory.Vehicule;

public class ConcretIterateurVehicule implements IterateurVehicule{
    public int position=0;
    public Catalogue catalogue;
    public ConcretIterateurVehicule(Catalogue catalogue){
        this.catalogue = catalogue;
    }
    @Override
    public Vehicule suivante() {
        return catalogue.vehicules.get(position++);
    }

    @Override
    public Boolean suivantDisponible() {
        return this.position < catalogue.vehicules.size();
    }
    
}