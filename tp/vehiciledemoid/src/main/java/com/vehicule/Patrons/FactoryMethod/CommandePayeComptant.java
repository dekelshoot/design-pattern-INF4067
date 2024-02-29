package com.vehicule.Patrons.FactoryMethod;

import java.util.ArrayList;

import com.vehicule.Patrons.AbstractFactory.Vehicule;
import com.vehicule.Patrons.Composite.Societe;

public class CommandePayeComptant extends Commande{

    public CommandePayeComptant(String idCommande,Societe societeCliente,ArrayList<Vehicule> vehicules) {
        super(idCommande,societeCliente,vehicules);
        this.type = "Comptant";
        this.idCommande = idCommande;

    }

}
