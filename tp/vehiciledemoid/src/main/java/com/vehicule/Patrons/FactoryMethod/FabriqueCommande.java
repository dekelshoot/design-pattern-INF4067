package com.vehicule.Patrons.FactoryMethod;

import java.util.ArrayList;

import com.vehicule.Patrons.AbstractFactory.Vehicule;
import com.vehicule.Patrons.Composite.Societe;

public abstract class FabriqueCommande {

    public  abstract Commande fabriqueCommande(String idCommande,Societe societeCliente,ArrayList<Vehicule> vehicules,String pays);
}
