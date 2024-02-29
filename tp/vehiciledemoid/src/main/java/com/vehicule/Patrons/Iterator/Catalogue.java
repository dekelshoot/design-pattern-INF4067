package com.vehicule.Patrons.Iterator;
import java.util.ArrayList;
import com.vehicule.Patrons.AbstractFactory.*;

public abstract class Catalogue {
    public  ArrayList<Vehicule> vehicules= new ArrayList<Vehicule>();

    public abstract  IterateurVehicule creerIterateur();
    public void setVehicules(ArrayList<Vehicule> vehicules){
        this.vehicules = vehicules;
    };
}
