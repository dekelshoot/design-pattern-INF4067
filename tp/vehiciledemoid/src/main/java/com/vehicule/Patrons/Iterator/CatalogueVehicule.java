package com.vehicule.Patrons.Iterator;
import com.vehicule.Patrons.AbstractFactory.Vehicule;

public class CatalogueVehicule extends Catalogue{

    @Override
    public IterateurVehicule creerIterateur() {
        return new ConcretIterateurVehicule(this);
    }

    public void ajouterVehicule(Vehicule vehicule) { 
        this.vehicules.add(vehicule);
    }
}
