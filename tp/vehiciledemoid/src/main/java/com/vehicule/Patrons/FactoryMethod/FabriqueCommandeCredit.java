package com.vehicule.Patrons.FactoryMethod;

import java.util.ArrayList;

import com.vehicule.Patrons.AbstractFactory.Vehicule;
import com.vehicule.Patrons.Composite.Societe;
import com.vehicule.Patrons.TemplateMethode.CommandeCreditCameroun;
import com.vehicule.Patrons.TemplateMethode.CommandeCreditCoteIvoire;
import com.vehicule.Patrons.TemplateMethode.CommandeCreditGabon;

public class FabriqueCommandeCredit extends FabriqueCommande {

    @Override
    public Commande fabriqueCommande(String idCommande, Societe societeCliente, ArrayList<Vehicule> vehicules,
            String pays) {
                if(pays.equals("Cameroun")){
                    return new CommandeCreditCameroun(idCommande,societeCliente,vehicules);
                }else if(pays.equals("Gabon")){
                    return new CommandeCreditGabon(idCommande,societeCliente,vehicules);
                }else{
                    return new CommandeCreditCoteIvoire(idCommande,societeCliente,vehicules);
                }
    }
}
