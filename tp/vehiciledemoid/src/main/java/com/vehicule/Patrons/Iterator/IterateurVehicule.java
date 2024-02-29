package com.vehicule.Patrons.Iterator;

import com.vehicule.Patrons.AbstractFactory.Vehicule;

public  interface IterateurVehicule {
    
    public Vehicule suivante();
    public Boolean suivantDisponible();
}  
    
