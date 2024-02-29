package com.vehicule.Patrons.FactoryMethod;
import com.vehicule.Patrons.Composite.Societe;
import java.util.ArrayList;

import com.vehicule.Patrons.AbstractFactory.Vehicule;

public class CommandeCredit extends Commande{

    public CommandeCredit(String idCommande,Societe societeCliente,ArrayList<Vehicule> vehicules) {
        super(idCommande,societeCliente,vehicules);
        this.type = "Credit";
        this.idCommande = idCommande;

    }


    
}
