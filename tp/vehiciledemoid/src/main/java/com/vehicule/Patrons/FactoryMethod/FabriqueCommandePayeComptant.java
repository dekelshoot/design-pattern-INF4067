package com.vehicule.Patrons.FactoryMethod;

import java.util.ArrayList;

import com.vehicule.Patrons.AbstractFactory.Vehicule;
import com.vehicule.Patrons.Composite.Societe;
import com.vehicule.Patrons.TemplateMethode.CommandePayeComptantCameroun;
import com.vehicule.Patrons.TemplateMethode.CommandePayeComptantCoteIvoire;
import com.vehicule.Patrons.TemplateMethode.CommandePayeComptantGabon;

public class FabriqueCommandePayeComptant extends FabriqueCommande {

    @Override
    public Commande fabriqueCommande(String idCommande, Societe societeCliente, ArrayList<Vehicule> vehicules,
            String pays) {
                if(pays.equals("Cameroun")){
                    return new CommandePayeComptantCameroun(idCommande,societeCliente,vehicules);
                }else if(pays.equals("Gabon")){
                    return new CommandePayeComptantGabon(idCommande,societeCliente,vehicules);
                }else{
                    return new CommandePayeComptantCoteIvoire(idCommande,societeCliente,vehicules);
                }
    }
}
